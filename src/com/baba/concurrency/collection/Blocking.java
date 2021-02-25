package com.baba.concurrency.collection;

import java.util.concurrent.*;

public class Blocking {

    private static void blockingQueue() {
        try {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            queue.offer(39);
            queue.offer(40, 7, TimeUnit.SECONDS);
            System.out.println(queue.poll());
            System.out.println(queue.poll(10, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void blockingDeque() {
        try {
            BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
            deque.offer(10);
            deque.offer(11, 5, TimeUnit.SECONDS);
            deque.offerFirst(9, 5, TimeUnit.SECONDS);
            deque.offerLast(12, 5, TimeUnit.SECONDS);

            System.out.println(deque);

            System.out.println(deque.poll());
            System.out.println(deque.poll(5, TimeUnit.SECONDS));
            System.out.println(deque.pollFirst(5, TimeUnit.SECONDS));
            System.out.println(deque.pollLast(5, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        blockingQueue();
        blockingDeque();
    }
}
