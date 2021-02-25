package com.baba.concurrency.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryConsistencyError {

    private static void wrong() {
        Map<String, Object> map = new HashMap<>();
        map.put("penguin", 1);
        map.put("flamingo", 2);
        for (String key : map.keySet()) {
            map.remove(key);
        }
    }

    private static void correct() {
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("penguin", 1);
        map.put("flamingo", 2);
        for (String key : map.keySet()) {
            map.remove(key);
        }
    }

    public static void main(String[] args) {
//        wrong();
        correct();
    }
}
