package com.baba.concurrency;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambda {

    private static void useCallable(Callable<Integer> callable) {}
    private static void useSupplier(Supplier<Integer> supplier) {}
    private static void use(Callable<Integer> callable) {}
    private static void use(Supplier<Integer> supplier) {}

    public static void main(String[] args) {
        useCallable(() -> {throw new IOException();});
        useSupplier(() -> {throw new RuntimeException();});
        use((Callable<Integer>) () -> {throw new IOException();});
        use((Supplier<Integer>) () -> {throw new RuntimeException();});
    }
}
