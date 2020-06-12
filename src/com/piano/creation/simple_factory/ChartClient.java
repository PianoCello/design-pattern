package com.piano.creation.simple_factory;

/**
 * 客户端测试类
 */
public class ChartClient {
    public static void main(String[] args) {
        Chart chart = null;
        chart = ChartFactory.getChart("line");
        chart.display();
    }
}
