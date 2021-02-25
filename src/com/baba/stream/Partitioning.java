package com.baba.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

    public static void main(String[] args) {
        partitioningBy();
        partitioningBySet();
    }

    private static void partitioningBy() {
        Map<Boolean, List<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map);
        System.out.println(map.getClass());
    }

    private static void partitioningBySet() {
        Map<Boolean, Set<String>> map = Stream.of("lions", "tigers", "bears")
                .collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map);
    }
}
