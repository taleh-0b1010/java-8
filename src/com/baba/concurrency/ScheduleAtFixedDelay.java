package com.baba.concurrency;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.*;

public class ScheduleAtFixedDelay {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService service = null;
        ScheduledFuture<?> future = null;
        try {
            service = Executors.newScheduledThreadPool(20);

            System.out.println(LocalDateTime.now());
            future = service.scheduleWithFixedDelay(() -> {
                for (int i = 0; i < 1000; i++) {
                    if (i % 100 == 0) {
                        System.out.println(i);
                    }
                }
            }, 0, 1, TimeUnit.NANOSECONDS);
//            future.get(1, TimeUnit.SECONDS);
//        } catch (TimeoutException e) {
//            System.out.println(LocalDateTime.now());
//            System.out.println("1 second result");
        } finally {
            Thread.sleep(100);
            if (Objects.nonNull(service)) {
                service.shutdown();
            }
        }
    }
}
