package com.example.zxing.test;

import com.example.zxing.wrapper.QrCodeGenWrapper;
import org.junit.jupiter.api.Test;

/**
 * Created by LiQian_Nice on 2018/6/14
 */
public class testZxing {
    @Test
    public void testGenQrCode() {
        String msg = "https://my.oschina.net/u/566591/blog/1359432";

        try {

            boolean ans = QrCodeGenWrapper.of(msg).asFile("src/test/qrcode/gen.png");
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("create qrcode error! e: " + e);
        }


//        //生成红色的二维码 300x300, 无边框
//        try {
//            boolean ans = QrCodeGenWrapper.of(msg)
//                    .setW(300)
//                    .setPreColor(0xffff0000)
//                    .setBgColor(0xffffffff)
//                    .setPadding(0)
//                    .asFile("src/test/qrcode/gen_300x300.png");
//            System.out.println(ans);
//        } catch (Exception e) {
//            System.out.println("create qrcode error! e: " + e);
//            Assert.assertTrue(false);
//        }


//        // 生成带logo的二维码
//        try {
//            String logo = "https://static.oschina.net/uploads/user/283/566591_100.jpeg";
//            boolean ans = QrCodeGenWrapper.of(msg)
//                    .setW(300)
//                    .setPreColor(0xffff0000)
//                    .setBgColor(0xffffffff)
//                    .setPadding(0)
//                    .setLogo(logo)
//                    .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
//                    .asFile("src/test/qrcode/gen_300x300_logo.png");
//            System.out.println(ans);
//        } catch (Exception e) {
//            System.out.println("create qrcode error! e: " + e);
//            Assert.assertTrue(false);
//        }
//
//
//        // 根据本地文件生成待logo的二维码
//        try {
//            String logo = "logo.jpg";
//            boolean ans = QrCodeGenWrapper.of(msg)
//                    .setW(300)
//                    .setPreColor(0xffff0000)
//                    .setBgColor(0xffffffff)
//                    .setPadding(0)
//                    .setLogo(logo)
//                    .asFile("src/test/qrcode/gen_300x300_logo_v2.png");
//            System.out.println(ans);
//        } catch (Exception e) {
//            System.out.println("create qrcode error! e: " + e);
//            Assert.assertTrue(false);
//        }
    }
}
