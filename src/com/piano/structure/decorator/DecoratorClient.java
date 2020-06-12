package com.piano.structure.decorator;

/**
 * 装饰模式测试客户端
 */
public class DecoratorClient {
    public static void main(String[] args) {

        Component component,component1,component2;

        //创建具体构件对象
        component = new ListBox();
        //创建装饰后的构件对象
        component1 = new BlackBorderDecorator(component);
        //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
        component2 = new ScrollBarDecorator(component1);

        component2.display();
    }
}
