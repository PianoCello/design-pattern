package com.piano.creation.singleton;

/**
 * 静态内部类实现单例模式
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    //静态内部类
    private static class InnerSingleton {
        private static final StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    public StaticInnerSingleton getInstance() {
        return InnerSingleton.singleton;
    }
}
