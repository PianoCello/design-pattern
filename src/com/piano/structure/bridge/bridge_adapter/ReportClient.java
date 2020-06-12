package com.piano.structure.bridge.bridge_adapter;

/**
 * 桥接模式和适配器模式（类）测试客户端
 */
public class ReportClient {
    public static void main(String[] args) {
        //创建数据输出对象
//        DataOutput dataOutput = new TextDataOutput();
        DataOutput dataOutput = new ExcelDataOutput();

        //创建报表显示对象
        ReportDisplay reportDisplay = new FirstDisplay();
        reportDisplay.setDataOutput(dataOutput);

        reportDisplay.display();
    }
}
