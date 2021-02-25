package com.baba.optional;

import java.util.Optional;

public class OptionalIfPresent {

    public static void main(String[] args) {

        Optional<String> optionalS = Optional.of("java");
        optionalS.ifPresent(s -> {
            if (s.equals("java"))
                throw new RuntimeException();
        });
    }
}
