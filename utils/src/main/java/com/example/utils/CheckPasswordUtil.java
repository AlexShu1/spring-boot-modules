package com.example.utils;

public class CheckPasswordUtil {

    public static String checkPassword(String passwordStr) {  
        String regexZ = "\\d*";  
        String regexS = "[a-zA-Z]+";  
        String regexT = "\\W+$";  
        String regexZT = "\\D*";  
        String regexST = "[\\d\\W]*";  
        String regexZS = "\\w*";  
        String regexZST = "[\\w\\W]*";  
  
        if (passwordStr.matches(regexZ)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexS)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexT)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexZT)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexST)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexZS)) {  
            return "��";  
        }  
        if (passwordStr.matches(regexZST)) {  
            return "ǿ";  
        }  
        return passwordStr;  
  
    }  
}
