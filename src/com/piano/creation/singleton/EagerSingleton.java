package com.piano.creation.singleton;

/**
 * 饿汉式单例，线程安全
 */
public class EagerSingleton {
    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }
}
