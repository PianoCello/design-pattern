package com.piano.structure.adapter;

/**
 * 汽车控制类，充当目标抽象类
 */
public abstract class CarController {
    public void move() {
        System.out.println("玩具汽车移动");
    }
    //发出声音
    abstract void phonate();
    //灯光闪烁
    abstract void twinkle();
}
