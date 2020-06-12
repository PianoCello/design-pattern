package com.piano.behavior.interpreter;

/**
 * 距离结点类，充当终结符表达式角色
 */
public class DistanceNode extends AbstractNode {

    //移动距离
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    @Override
    public String interpret() {
        return distance;
    }
}
