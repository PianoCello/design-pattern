package com.piano.structure.bridge.bridge_adapter;

/**
 * 文本类型数据输出，充当桥接模式具体实现类
 */
public class TextDataOutput implements DataOutput {
    @Override
    public void output() {
        System.out.println("输出文本类型数据");
    }
}
