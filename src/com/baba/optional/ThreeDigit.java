package com.baba.optional;

/*
* We have Optional<Integer> and asked to print the value,
* but only if it is a three-digit number
* */

import java.util.Optional;

public class ThreeDigit {

    public static void main(String[] args) {
        threeDigitOpt();
    }

    private static void threeDigitOpt() {
        Optional.of(555)
                .map(Object::toString)
                .filter(x -> x.length() == 3)
                .ifPresent(System.out::println);
    }
}
