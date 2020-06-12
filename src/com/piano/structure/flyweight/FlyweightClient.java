package com.piano.structure.flyweight;

/**
 * 享元模式测试客户端
 */
public class FlyweightClient {
    public static void main(String[] args) {
        //获取享元工厂对象
        GoChessmanFactory chessmanFactory = GoChessmanFactory.getInstance();

        GoChessman back = chessmanFactory.getGoChessman("black");
        GoChessman back2 = chessmanFactory.getGoChessman("black");

        GoChessman white = chessmanFactory.getGoChessman("white");
        GoChessman white2 = chessmanFactory.getGoChessman("white");

        System.out.println("判断两个黑子是否相同：" + (back == back2));
        System.out.println("判断两个白子是否相同：" + (white == white2));
        back.display(new Coordinates(1,2));
        back2.display(new Coordinates(10,12));
        white.display(new Coordinates(7,8));
        white2.display(new Coordinates(4,15));
    }
}
