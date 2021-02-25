package com.baba.concurrency.parallel.order;

import java.util.Arrays;
import java.util.List;

/**
 * Any stream operation that is based on order, including findFirst() , limit() , or
 * skip() , may actually perform more slowly in a parallel environment. This is a result of a
 * parallel processing task being forced to coordinate all of its threads in a synchronized-like
 * fashion.
 *
 * With parallel streams, the results of findAny() are no longer predictable
 *
 * Using unordered() method on parallel streams can greatly improve performance
 */

public class OrderBasedOperations {

    private static final List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static void main(String[] args) {
        findAnySerialAndParallel();
        limitSerialAndParallel();
        unorderedWithParallel();
    }

    private static void findAnySerialAndParallel() {
        System.out.println("findAny()\n---------------");
        data.stream()
                .findAny()
                .ifPresent(i -> System.out.println("serial: " + i));

        data.parallelStream()
                .findAny()
                .ifPresent(i -> System.out.println("parallel: " + i));
        System.out.println();
    }

    private static void limitSerialAndParallel() {
        System.out.println("limit(), skip() and findFirst()\n---------------");
        data.stream()
                .skip(3)
                .limit(4)
                .findFirst()
                .ifPresent(i -> System.out.println("serial: " + i));

        data.parallelStream()
                .skip(3)
                .limit(4)
                .findFirst()
                .ifPresent(i -> System.out.println("parallel: " + i));
        System.out.println();
    }

    private static void unorderedWithParallel() {
        System.out.println("unordered()\n---------------");
        data.parallelStream().unordered()
                .skip(3)
                .limit(4)
                .findFirst()
                .ifPresent(i -> System.out.println("parallel: " + i));
    }
}
