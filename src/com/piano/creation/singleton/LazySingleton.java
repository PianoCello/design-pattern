package com.piano.creation.singleton;

/**
 * 懒汉式单例类，锁定方法
 */
public class LazySingleton {
    private static LazySingleton singleton = null;
    private LazySingleton() {

    }
    // synchronized 关键字锁定方法
    public synchronized static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
