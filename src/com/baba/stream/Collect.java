package com.baba.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {
        joining();
        joiningInts();
        averagingInt();
        collectToTreeSet();
        collectToTreeMap();
        collectToHashMap();
        collectToList();
    }

    private static void joining() {
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        String result = stream.collect(Collectors.joining(" | "));
        System.out.println(result);
    }

    private static void joiningInts() {
        String s = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> x + "")
                .collect(Collectors.joining());
        System.out.println(s);
    }

    private static void averagingInt() {
        Double result = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.averagingInt(String::length));
        System.out.println(result);
    }

    private static void collectToTreeSet() {
        Stream.of("lions", "tigers", "bears")
                .filter(x -> x.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(System.out::println);
    }

    private static void collectToTreeMap() {
        Map<Integer, String> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2, TreeMap::new));
        System.out.println(map);
    }

    private static void collectToHashMap() {
        Map<Integer, String> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2));
        System.out.println(map);
        System.out.println(map.getClass());
    }

    private static void collectToList() {
        List<String> list = Stream.of("lions", "tigers", "bears")
                .filter(x -> x.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(list.getClass());
    }
}
