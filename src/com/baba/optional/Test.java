package com.baba.optional;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        int value = 5;

        Optional<Integer> optional = Optional.ofNullable(value);
    }
}
