package com.baba.stream.primitive.optional;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class OptionalPrimitive {

    public static void main(String[] args) {
        avg();
        System.out.println();

        sum();
        System.out.println();

        max();
        System.out.println();
    }

    private static void avg() {
        double d = LongStream.of(1, 2, 3)
                .average()
                .getAsDouble();
        System.out.println(d);

        double d1 = LongStream.empty()
                .average()
                .orElse(.0);
        System.out.println(d1);

        double d2 = LongStream.empty()
                .average()
                .orElseGet(() -> .0);
        System.out.println(d2);

        LongStream.of(1, 2, 3)
                .average()
                .ifPresent(System.out::println);
    }

    private static void sum() {
        double d = DoubleStream.iterate(1, n -> n + 1)
                .limit(5)
                .sum();
        System.out.println(d);
    }

    private static void max() {
        long l = LongStream.of(4, 7, 9)
                .max()
                .orElseThrow(RuntimeException::new);
        System.out.println(l);

        long l1 = LongStream.of(4, 7, 9)
                .max()
                .getAsLong();
        System.out.println(l1);
    }
}
