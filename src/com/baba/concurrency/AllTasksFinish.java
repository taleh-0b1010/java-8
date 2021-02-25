package com.baba.concurrency;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AllTasksFinish {

    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(30);

            service.submit(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("a:   " + i);
                    AllTasksFinish.counter++;
                }
            });

            System.out.println("--------------------------");
//            service = Executors.newFixedThreadPool(30);
            service.submit(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("b:   " + i);
                    AllTasksFinish.counter++;
                }
            });

        } finally {
            if (Objects.nonNull(service)) {
                service.shutdown();
            }
        }

        service.awaitTermination(1, TimeUnit.SECONDS);
        if (service.isTerminated())
            System.out.println("All tasks finished");
        else
            System.out.println("At least one task is still running");

        System.out.println(counter);
    }
}
