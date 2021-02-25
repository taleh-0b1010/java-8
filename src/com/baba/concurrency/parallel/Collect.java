package com.baba.concurrency.parallel;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {
        toConcurrentSkipListSet();
        toSet();
        toConcurrentHashMap();
    }

    private static void toConcurrentSkipListSet() {
        Set<String> set = Arrays.asList("w", "o", "l", "f").parallelStream()
                .collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);
        System.out.println(set.getClass());
    }

    private static void toSet() {
        Set<String> set = Stream.of("w", "o", "l", "f").parallel()
                .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(set.getClass());
    }

    private static void toConcurrentHashMap() {
        Map<Integer, String> map = Stream.of("lions", "tigers", "bears").parallel()
                .collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2, ConcurrentHashMap::new));
        System.out.println(map);
        System.out.println(map.getClass());
    }
}
