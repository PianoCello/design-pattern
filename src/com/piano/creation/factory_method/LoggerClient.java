package com.piano.creation.factory_method;

/**
 * 客户端测试类
 */
public class LoggerClient {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = null;
        Logger logger = null;
        //可引入配置文件和反射机制实现
        loggerFactory = new DatabaseLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
