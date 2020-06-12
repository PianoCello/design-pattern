package com.piano.behavior.command.undo_command;

/**
 * 计算器测试客户端
 */
public class CalculatorClient {
    public static void main(String args[]) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();

        //向发送者注入命令对象
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(20);
        form.undo();
    }
}
