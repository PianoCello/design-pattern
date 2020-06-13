package com.piano.behavior.mediator;

/**
 * 中介者模式测试客户端
 */
public class MediatorClient {
    public static void main(String[] args) {
        //构建中介者对象
        Mediator mediator = new ConcreteMediator();

        //构建具体同事对象
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        //注册同事
        mediator.register(colleague1);
        mediator.register(colleague2);

        //发送消息
        colleague1.send();
        colleague2.send();
    }
}
