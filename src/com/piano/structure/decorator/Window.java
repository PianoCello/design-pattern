package com.piano.structure.decorator;

/**
 * 窗体类，充当具体构件类
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
