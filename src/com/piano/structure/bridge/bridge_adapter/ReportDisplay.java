package com.piano.structure.bridge.bridge_adapter;

/**
 * 报表显示，充当桥接模式抽象类
 */
public abstract class ReportDisplay {

    //数据输出 引用
    protected DataOutput dataOutput;

    public void setDataOutput(DataOutput dataOutput) {
        this.dataOutput = dataOutput;
    }

    //抽象显示方法
    abstract void display();
}
