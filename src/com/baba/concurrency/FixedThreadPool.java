package com.baba.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    private static void task() {
        System.out.println("Task: {} " + LocalDateTime.now());
    }

    private static void perform() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            service.submit(FixedThreadPool::task);
        }
    }

    public static void main(String[] args) {
        perform();
    }
}
