package com.piano.structure.flyweight;

/**
 * 白色棋子类，充当具体享元类
 */
public class WhiteGoChessman extends GoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
