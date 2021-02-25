package com.baba.concurrency;

public class PollingWithSleep {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                PollingWithSleep.counter++;
                System.out.println(i);
            }
        }).start();

        while (PollingWithSleep.counter < 6) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }

        System.out.println("Reached!");
    }
}
