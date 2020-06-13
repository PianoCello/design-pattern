package com.piano.behavior.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    //维持一个中介者对象的引用
    protected Mediator mediator;

    //接受消息
    public abstract void receive();

    //发送消息
    public abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
