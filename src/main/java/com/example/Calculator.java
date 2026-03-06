package com.example;

/**
 * 简单的计算器类
 * 用于测试代码审查功能
 */
public class Calculator {

    /**
     * 加法运算
     * @param a 第一个数
     * @param b 第二个数
     * @return 和
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 减法运算
     * @param a 被减数
     * @param b 减数
     * @return 差
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 乘法运算
     * @param a 第一个数
     * @param b 第二个数
     * @return 积
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 除法运算
     * @param a 被除数
     * @param b 除数
     * @return 商
     */
    public int divide(int a, int b) {
        return a / b;  // 故意不检查除零，测试代码审查
    }
}
