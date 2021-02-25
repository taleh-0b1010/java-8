package com.baba.concurrency.parallel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {
        groupingBy();
    }

    private static void groupingBy() {
        Map<Integer, List<String>> map = Stream.of("lions", "tigers", "bears").parallel()
                .collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map);
        System.out.println(map.getClass());

        System.out.println(LocalDateTime.now());
    }
}
