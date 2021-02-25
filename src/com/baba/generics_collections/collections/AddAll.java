package com.baba.generics_collections.collections;

import java.util.LinkedList;
import java.util.List;

public class AddAll {

    public static void main(String[] args) {
        List<String> one = new LinkedList<>();
        one.add("aa");
        one.add("bb");

        List<String> two = new LinkedList<>();
        two.add("cc");
        two.add("dd");

        one.addAll(two);

        System.out.println(one);
    }
}
