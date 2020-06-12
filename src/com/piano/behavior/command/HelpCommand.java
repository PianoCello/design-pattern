package com.piano.behavior.command;

/**
 * 帮助命令类，充当具体命令类
 */
public class HelpCommand extends Command {
    //维持对请求接收者的引用
    private DisplayHelp displayHelp;

    public HelpCommand() {
        this.displayHelp = new DisplayHelp();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        displayHelp.display();
    }
}
