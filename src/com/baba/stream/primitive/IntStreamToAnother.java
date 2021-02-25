package com.baba.stream.primitive;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamToAnother {

    private static void toStream() {
        IntStream.rangeClosed(1, 6)
                .mapToObj(Integer::toString)
                .forEach(System.out::println);
        System.out.println("---------------");
    }

    private static void toDoubleStream() {
        IntStream.rangeClosed(1, 6)
                .mapToDouble(x -> (double)x)
                .forEach(System.out::println);
        System.out.println("---------------");
    }

    private static void toIntStream() {
        IntStream.rangeClosed(1, 6)
                .map(x -> x * 2)
                .forEach(System.out::println);
        System.out.println("---------------");
    }

    private static void toPrimitive() {
        Stream.of("Java", "Go")
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        toStream();
        toDoubleStream();
        toIntStream();
        toPrimitive();
    }
}
