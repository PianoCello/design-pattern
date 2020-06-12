package com.piano.structure.adapter;

/**
 * 警车适配器，充当适配器
 */
public class PoliceCarAdapter extends CarController{

    //定义适配者 PoliceSound 对象
    private PoliceSound policeSound;
    //定义适配者 PoliceLamp 对象
    private PoliceLamp policeLamp;

    public PoliceCarAdapter() {
        this.policeSound = new PoliceSound();
        this.policeLamp = new PoliceLamp();
    }

    //发出警笛声音
    @Override
    void phonate() {
        //调用适配者类 PoliceSound 的方法
        policeSound.alarmSound();
    }

    //呈现警灯闪烁
    @Override
    void twinkle() {
        //调用适配者类 PoliceLamp 的方法
        policeLamp.alarmLamp();
    }
}
