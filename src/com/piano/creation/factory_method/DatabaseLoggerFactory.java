package com.piano.creation.factory_method;

/**
 * 数据库日志记录器，充当具体工厂角色
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //使用默认方式连接数据库，代码省略
        Logger databaseLogger = new DatabaseLogger();
        //初始化数据库日志记录器对象
        return databaseLogger;
    }
    @Override
    public Logger createLogger(String args) {
        //使用 args 作为连接字符串来连接数据库，代码省略
        Logger databaseLogger = new DatabaseLogger();
        //初始化数据库日志记录器对象
        return databaseLogger;
    }
    @Override
    public Logger createLogger(Object obj) {
        //使用封装在 obj 中的字符串来连接数据库，代码省略
        Logger databaseLogger = new DatabaseLogger();
        //使用封装在 obj 中数据来初始化数据库日志记录器对象
        return databaseLogger;
    }

}
