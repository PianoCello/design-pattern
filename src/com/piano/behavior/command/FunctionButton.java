package com.piano.behavior.command;

/**
 * 功能键类，充当请求调用者
 */
public class FunctionButton {
    //维持一个抽象命令对象的引用
    private Command command;

    //将功能键注入命令
    public FunctionButton(Command command) {
        this.command = command;
    }

    public void click() {
        System.out.println("单击功能键！");
        command.execute();
    }
}
