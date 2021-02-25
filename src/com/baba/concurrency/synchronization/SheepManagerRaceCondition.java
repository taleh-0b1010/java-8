package com.baba.concurrency.synchronization;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerRaceCondition {

    private int sheepCount = 0;

    private void incrementAndReport() {
        System.out.print(++sheepCount + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerRaceCondition manager = new SheepManagerRaceCondition();
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }
        } finally {
            if (Objects.nonNull(service))
                service.shutdown();
        }
    }
}
