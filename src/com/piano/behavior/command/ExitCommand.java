package com.piano.behavior.command;

/**
 * 退出命令类，充当具体命令类
 */
public class ExitCommand extends Command {
    //维持对请求接收者的引用
    private SystemExit systemExit;

    public ExitCommand() {
        this.systemExit = new SystemExit();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        systemExit.exit();
    }
}
