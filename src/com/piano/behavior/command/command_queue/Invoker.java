package com.piano.behavior.command.command_queue;

/**
 * Invoker 调用者
 */
public class Invoker {
    //维持一个 CommandQueue 对象的引用
    private CommandQueue commandQueue;

    //构造注入
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //调用 CommandQueue 类的 execute() 方法
    public void call() {
        commandQueue.execute();
    }
}
