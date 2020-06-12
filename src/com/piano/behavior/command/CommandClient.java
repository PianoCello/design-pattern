package com.piano.behavior.command;

/**
 * 命令模式测试客户端
 */
public class CommandClient {
    public static void main(String[] args) {
        //可以通过配置文件配置具体命令类
        Command command = new HelpCommand();
        FunctionButton functionButton = new FunctionButton(command);

        functionButton.click();
        //单击功能键！
        //显示帮助文档！
    }
}
