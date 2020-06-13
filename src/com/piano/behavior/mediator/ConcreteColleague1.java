package com.piano.behavior.mediator;

/**
 * 具体同事类1
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("colleague1 receive message.");
    }

    @Override
    public void send() {
        System.out.println("colleague1 send message.");
        //请求中介者转发
        this.mediator.relay(this);
    }
}
