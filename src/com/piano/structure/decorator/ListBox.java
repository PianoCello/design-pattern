package com.piano.structure.decorator;

/**
 * 列表框类，充当具体构件类
 */
public class ListBox extends Component {
    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
