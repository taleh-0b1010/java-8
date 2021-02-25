package com.baba.stream.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamAvg {

    public static void main(String[] args) {
        avarage();
        count();
        countRange();
    }

    private static void avarage() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        avg.ifPresent(System.out::println);

        System.out.println(avg.getAsDouble());
        System.out.println("-----------------------------");
    }

    private static void count() {
        IntStream intStream = IntStream.iterate(1, n -> n + 1).limit(5);
        intStream.forEach(System.out::println);
        System.out.println("-----------------------------");
    }

    private static void countRange() {
        IntStream intStream1 = IntStream.range(1, 6);
        intStream1.forEach(System.out::print);

        System.out.println();

        IntStream intStream2 = IntStream.rangeClosed(1, 6);
        intStream2.forEach(System.out::print);
        System.out.println();
        System.out.println("-----------------------------");
    }
}
