package com.example.zxing.bean;

import com.example.utils.QRCode.MatrixToImageConfig;
import com.google.zxing.EncodeHintType;
import lombok.Data;

import java.util.Map;

/**
 * Created by LiQian_Nice on 2018/6/14
 */
@Data
public class QrCodeOptions {
    /**
     * 塞入二维码的信息
     */
    private String msg;


    /**
     * 二维码中间的logo
     */
    private String logo;


    /**
     * logo的样式， 目前支持圆角+普通
     */
    private LogoStyle logoStyle;


    /**
     * 生成二维码的宽
     */
    private Integer w;


    /**
     * 生成二维码的高
     */
    private Integer h;


    /**
     * 生成二维码的颜色
     */
    private MatrixToImageConfig matrixToImageConfig;


    private Map<EncodeHintType, Object> hints;


    /**
     * 生成二维码图片的格式 png, jpg
     */
    private String picType;


    public enum LogoStyle {
        ROUND,
        NORMAL;
    }
}
