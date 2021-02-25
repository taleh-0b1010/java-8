package com.baba.integer;

import java.util.Optional;

public class ExExample {

    public static void main(String[] args) {
        System.out.println(new ExExample().testOpt());
    }

    private Optional<String> test() {
        String s = "aaa";
        if (s.equals("aaa")) {
            throw new RuntimeException("dsfs");
        }
        return Optional.ofNullable(s);
    }

    private String testOpt() {
        return test()
                .filter(s -> s.equals("aaa"))
                .orElse(null);
    }
}
