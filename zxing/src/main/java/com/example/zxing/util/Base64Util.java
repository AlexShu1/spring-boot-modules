package com.example.zxing.util;

import java.io.ByteArrayOutputStream;
import java.util.Base64;

/**
 * Created by LiQian_Nice on 2018/6/14
 */
public class Base64Util {
    public static String encode(ByteArrayOutputStream outputStream) {
        return Base64.getEncoder().encodeToString(outputStream.toByteArray());
    }
}
