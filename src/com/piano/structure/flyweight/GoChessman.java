package com.piano.structure.flyweight;

/**
 * 围棋棋子抽象类，充当抽象享元类
 */
public abstract class GoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色：" + this.getColor() +
                "，棋子位置：" + coordinates.getX() + "，" + coordinates.getY());
    }
}
