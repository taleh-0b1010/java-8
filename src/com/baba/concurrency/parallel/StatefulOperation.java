package com.baba.concurrency.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StatefulOperation {

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .map(i -> {list.add(i); return i;})
                .forEachOrdered(i -> System.out.print(i + " "));

        System.out.println("\n" + list);
    }
}