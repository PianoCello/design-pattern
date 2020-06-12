package com.piano.creation.abstract_factory;

/**
 * Summer 文本框，充当具体产品
 */
public class SummerTextField  implements TextField{
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}