package com.baba.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {
        groupingBy();
        groupingByEmptyStream();
        groupingBySet();
        groupingBySetToTreeMap();
        groupingByListToTreeMap();
        groupingByCounting();
    }

    private static void groupingBy() {
        Map<Integer, List<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        System.out.println(map.getClass());
    }

    private static void groupingByEmptyStream() {
        Stream<String> stream = Stream.empty();
        Map<Boolean, List<String>> map = stream
                .collect(Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(map);
    }

    private static void groupingBySet() {
        Map<Integer, Set<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);
    }

    private static void groupingBySetToTreeMap() {
        TreeMap<Integer, Set<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map);
    }

    private static void groupingByListToTreeMap() {
        TreeMap<Integer, List<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map);
    }

    private static void groupingByCounting() {
        Map<Integer, Long> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);
    }
}
