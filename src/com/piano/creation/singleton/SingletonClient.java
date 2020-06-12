package com.piano.creation.singleton;

/**
 * 单例模式测试客户端
 */
public class SingletonClient {
    public static void main(String[] args) {

        SimpleSingleton instance = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = SimpleSingleton.getInstance();

        System.out.println(instance==instance2);

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton==eagerSingleton2);

    }
}
