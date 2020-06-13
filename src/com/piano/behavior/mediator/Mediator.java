package com.piano.behavior.mediator;

/**
 * 抽象中介者类
 */
public abstract class Mediator {
    //注册同事对象
    abstract void register(Colleague colleague);
    //通知中介者，发送消息
    abstract void relay(Colleague colleague);
}






