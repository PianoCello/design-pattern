package com.piano.behavior.interpreter;

/**
 * 简单表达式结点类，充当非终结符表达式角色
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单表达式句子的解释操作
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
