package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单处理类
 * 包含代码问题用于测试
 */
public class OrderService {

    // 问题1: 静态可变状态
    private static List<String> orders = new ArrayList<>();

    // 问题2: 魔法数字
    public void processOrder(String orderId) {
        if (orderId == null || orderId.length() < 10) {
            throw new IllegalArgumentException("Invalid order ID");
        }

        // 问题3: 没有考虑线程安全
        orders.add(orderId);

        // 问题4: 硬编码时间
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // 吞掉异常
        }
    }

    // 问题5: 返回null而不是空集合
    public List<String> getOrders() {
        if (orders.isEmpty()) {
            return null;
        }
        return orders;
    }

    // 问题6: 没有使用泛型
    @SuppressWarnings("rawtypes")
    public void legacyMethod(List list) {
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
