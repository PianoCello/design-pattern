package com.piano.behavior.command.command_queue;

import com.piano.behavior.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * CommandQueue 负责存储多个命令对象
 */
public class CommandQueue {
    //定义一个 List 来存储命令队列
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    //循环调用每一个命令对象的 execute() 方法
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
