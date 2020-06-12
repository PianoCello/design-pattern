package com.piano.structure.bridge.bridge_adapter;

/**
 * 第二种报表显示方式，充当扩充抽象类
 */
public class SecondDisplay extends ReportDisplay {
    @Override
    void display() {
        System.out.println("第二种报表显示方式！");
        dataOutput.output();
    }
}
