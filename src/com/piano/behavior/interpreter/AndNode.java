package com.piano.behavior.interpreter;

/**
 * 复合表达式结点类，充当非终结符表达式角色
 */
public class AndNode extends AbstractNode{
    //左结点
    private AbstractNode leftNode;
    //右结点
    private AbstractNode rightNode;

    public AndNode(AbstractNode leftNode, AbstractNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public String interpret() {
        return leftNode.interpret() + " 再 "+rightNode.interpret();
    }
}
