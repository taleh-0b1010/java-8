package com.baba.concurrency;

import java.util.Objects;
import java.util.concurrent.*;

public class CheckResults {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            System.out.println("Begin");
            service = Executors.newSingleThreadExecutor();

            Future<?> future = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                    if (CheckResults.counter % 100 == 0) {
                        System.out.println(CheckResults.counter);
                    }
                }
            });

            future.get(10, TimeUnit.MILLISECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (!Objects.isNull(service))
                service.shutdown();
        }
    }
}
