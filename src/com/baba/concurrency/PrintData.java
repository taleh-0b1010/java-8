package com.baba.concurrency;

public class PrintData {

    public static void main(String[] args) {
        System.out.println("Begin");
        new PrintDataWithThread().start();
        new Thread(new PrintDataWithRunnable()).start();
        new PrintDataWithThread().start();
        System.out.println("End");

        System.out.println("---------------------------------------------");

        new PrintDataWithRunnable().run();
        new Thread(new PrintDataWithRunnable()).run();
        new PrintDataWithThread().run();
    }
}

class PrintDataWithRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record: " + i);
        }
    }
}

class PrintDataWithThread extends Thread {

    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }
}
