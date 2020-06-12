package com.piano.structure.adapter;

/**
 * 适配器客户端测试类
 */
public class AdapterClient {
    public static void main(String[] args) {
        CarController carController = new PoliceCarAdapter();

        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
