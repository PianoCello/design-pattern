package com.piano.creation.singleton;

/**
 * 最简单的单例模式(线程不安全)
 */
public class SimpleSingleton {
    private static SimpleSingleton singleton = null;

    private SimpleSingleton() {
    }
    public static SimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}
