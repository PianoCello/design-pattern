package com.piano.behavior.interpreter;

/**
 * 解释器模式测试客户端
 */
public class InterpreterClient {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20 and left move 20 and up run 456 and up run 456";
        //创建指定处理类
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String output = handler.output();

        //输入指令对应的操作
        System.out.println(output);
    }
}
