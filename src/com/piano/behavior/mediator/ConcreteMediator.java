package com.piano.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/***
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {

    /**
     * 被中介者协调的同事对象
     */
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    //注册同事对象到中介者对象的集合中
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            //添加同事对象
            this.colleagues.add(colleague);
            //同事对象维持一个中介者对象
            colleague.setMediator(this);
        }
    }

    //转发请求
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}

