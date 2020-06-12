package com.piano.creation.singleton;

/**
 * 双重检查锁定的单例类
 */
public class DoubleCheckSingleton {
    //必须加 volatile 关键字，使多个线程之间的内存可见
    private static volatile DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {
    }

    //双重检查锁定
    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            //锁定代码块
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
