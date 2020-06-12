package com.piano.structure.decorator;

/**
 * 抽象构件装饰类
 */
public class ComponentDecorator extends Component {
    //维持对抽象构件类型对象的引用
    private Component component;

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        //调用原有业务方法
        component.display();
    }
}
