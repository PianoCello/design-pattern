package com.piano.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 围棋棋子工厂类，充当享元工厂类，使用单例模式对其进行设计
 */
public class GoChessmanFactory {
    //饿汉式单例
    private static GoChessmanFactory instance = new GoChessmanFactory();
    //使用 Map 来存储享元对象，充当享元池
    private Map<String, GoChessman> chessmanMap = null;

    private GoChessmanFactory() {
        chessmanMap = new HashMap<>();
        System.out.println("初始化。。。");
        GoChessman black, white;
        black = new BlackGoChessman();
        white = new WhiteGoChessman();
        chessmanMap.put("black", black);
        chessmanMap.put("white", white);
    }

    //返回享元工厂类的唯一实例
    public static GoChessmanFactory getInstance() {
        return instance;
    }

    //通过 key 获取存储在 map 中的享元对象
    public GoChessman getGoChessman(String key) {
        return chessmanMap.get(key);
    }
}
