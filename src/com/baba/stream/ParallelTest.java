package com.baba.stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ParallelTest {

    private Callable<String> createTask(String s) {
        return () -> {
            Thread.sleep(100);
            System.out.println(s);
            return s;
        };
    }

    private void calculate() {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add("test " + i);
        }

        System.out.println("1");
        System.out.println(LocalDateTime.now());
        List<Callable<String>> tasks = list.stream()
                .map(this::createTask)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("2");
        System.out.println(LocalDateTime.now());
        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(20);

            service.invokeAll(tasks);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (Objects.nonNull(service))
                service.shutdown();
        }
    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        ParallelTest p = new ParallelTest();
        p.calculate();
        System.out.println("3");
        System.out.println(LocalDateTime.now());
    }
}
