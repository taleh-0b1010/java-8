package com.baba.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Intermediate {

    public static void main(String[] args) {
        sorted();
    }

    private static void sorted() {
        Stream<String> s = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        s1.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
