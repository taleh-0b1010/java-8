package com.baba.concurrency.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    private AtomicInteger i;

    public static void main(String[] args) {
        AtomicTest test = new AtomicTest();
        test.i = new AtomicInteger(5);
        test.i.incrementAndGet();
        System.out.println(test.i);

        System.out.println(test.i.intValue() > 5);
    }
}
