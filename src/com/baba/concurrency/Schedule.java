package com.baba.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
    int count = 0;
    ScheduledExecutorService service;
    private void test() {
        if (count == 5) {
            if (service != null) {
                service.shutdown();
            }
        }
        for (int i = 0; i < 1000; i++) {
        }
        count += 1;
        System.out.println(count);
    }

    private void calculate() {
        try {
            service = Executors.newSingleThreadScheduledExecutor();
            service.scheduleWithFixedDelay(this::test, 0, 1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        schedule.calculate();
    }
}
