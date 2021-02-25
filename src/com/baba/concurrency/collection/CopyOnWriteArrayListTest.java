package com.baba.concurrency.collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    private static final CopyOnWriteArrayList<Long> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            list.add((long)i);
        }

        list.add((long)1);
        list.add((long)1);
        list.add((long)1);
        System.out.println(list);

        list.removeIf(aLong -> aLong.equals((long)1));

        System.out.println(list);
    }
}
