package com.piano.structure.bridge.bridge_adapter;

/**
 * 第一种报表显示方式，充当扩充抽象类
 */
public class FirstDisplay extends ReportDisplay {
    @Override
    void display() {
        System.out.println("第一种报表显示方式！");
        dataOutput.output();
    }
}
