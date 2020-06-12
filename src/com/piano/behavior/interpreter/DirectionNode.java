package com.piano.behavior.interpreter;

/**
 * 方向结点类，充当终结符表达式角色
 */
public class DirectionNode extends AbstractNode {
    //移动方向
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }
    //方向表达式的解释操作
    @Override
    public String interpret() {
        if (direction.equalsIgnoreCase("up")) {
            return " 向上 ";
        } else if (direction.equalsIgnoreCase("down")) {
            return " 向下 ";
        } else if (direction.equalsIgnoreCase("left")) {
            return " 向左 ";
        } else if (direction.equalsIgnoreCase("right")) {
            return " 向右 ";
        } else {
            return " 未知方向 ";
        }
    }
}
