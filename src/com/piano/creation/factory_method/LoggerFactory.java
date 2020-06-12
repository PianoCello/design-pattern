package com.piano.creation.factory_method;

/**
 * 日志记录器工厂接口，充当抽象工厂角色
 */
public interface LoggerFactory {
    Logger createLogger();
    Logger createLogger(String args);
    Logger createLogger(Object obj);
}
