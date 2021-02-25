package com.baba.patterns;

import java.util.Objects;

public class ThreadSafeLazySingleton {

    private ThreadSafeLazySingleton() {}

    private static volatile ThreadSafeLazySingleton INSTANCE;

    public static ThreadSafeLazySingleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new ThreadSafeLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
