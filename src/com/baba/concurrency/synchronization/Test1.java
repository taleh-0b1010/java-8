package com.baba.concurrency.synchronization;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(new HashSet<>(Arrays.asList(1, 3, 5)) {
                    {
                        System.out.println("HashSet Created");
                    }
                }::contains)
                .forEach(System.out::println);
    }
}
