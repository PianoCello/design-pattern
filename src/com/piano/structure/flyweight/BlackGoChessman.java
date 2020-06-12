package com.piano.structure.flyweight;

/**
 * 黑色棋子类，充当具体享元类
 */
public class BlackGoChessman extends GoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}
