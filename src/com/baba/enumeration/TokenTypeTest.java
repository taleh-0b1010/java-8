package com.baba.enumeration;

import java.util.Arrays;

public class TokenTypeTest {

    public static void main(String[] args) {

        System.out.println(TokenType.of("ACCESS"));
    }
}

enum TokenType {
    ACCESS,
    REFRESH,
    VERIFY,
    FINALIZE;

    public static TokenType of(String tokenType) {
        return Arrays.stream(TokenType.values())
                .filter(type -> type.name().equals(tokenType))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
