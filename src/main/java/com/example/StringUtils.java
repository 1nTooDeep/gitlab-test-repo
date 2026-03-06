package com.example;

/**
 * 字符串工具类
 */
public class StringUtils {

    /**
     * 反转字符串
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * 检查字符串是否为空
     * 问题：对于空白字符串返回false但命名不清
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 连接字符串数组
     * 问题：使用+号拼接，性能差
     */
    public static String join(String[] parts, String delimiter) {
        String result = "";
        for (int i = 0; i < parts.length; i++) {
            result += parts[i];
            if (i < parts.length - 1) {
                result += delimiter;
            }
        }
        return result;
    }
}
