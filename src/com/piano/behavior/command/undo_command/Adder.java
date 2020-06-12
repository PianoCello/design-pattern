package com.piano.behavior.command.undo_command;

/**
 * 加法类，充当请求接收者
 */
public class Adder {
    //定义初始值为0
    private int num = 0;

    //加法操作，每次将传入的值与 num 作加法运算
    public int add(int value) {
        num += value;
        return num;
    }
}