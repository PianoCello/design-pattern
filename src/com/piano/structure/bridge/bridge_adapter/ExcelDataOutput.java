package com.piano.structure.bridge.bridge_adapter;

/**
 * Excel 类型数据输出，充当桥接模式具体实现类、适配器模式适配器类
 */
public class ExcelDataOutput extends ExcelAPI implements DataOutput {
    @Override
    public void output() {
        //调用第三方适配者
        super.deal();
        System.out.println("输出 Excel 类型数据");
    }
}
