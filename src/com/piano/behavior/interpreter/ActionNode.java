package com.piano.behavior.interpreter;

/**
 * 动作结点类，充当终结符表达式角色
 */
public class ActionNode extends AbstractNode {
    //移动方式
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }
    //动作表达式的解释操作
    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return " 移动 ";
        } else if (action.equalsIgnoreCase("run")) {
            return " 快速移动 ";
        } else {
            return " 未知动作 ";
        }
    }
}
