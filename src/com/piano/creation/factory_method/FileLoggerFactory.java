package com.piano.creation.factory_method;

/**
 * 文件日志记录器，充当具体工厂角色
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //初始化文件日志记录器对象
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }

    @Override
    public Logger createLogger(Object obj) {
        return null;
    }
}
