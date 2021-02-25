package com.baba.enumeration;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PeriodTest {

    public static void main(String[] args) {
        CardPeriod.of(12);

        long smallest = 1000_0000_0000_0000L;
        long biggest =  9999_9999_9999_9999L;

        // return a long between smallest and biggest (+1 to include biggest as well with the upper bound)
        long random = ThreadLocalRandom.current().nextLong(smallest, biggest+1);
        System.out.println(random);
    }
}

enum CardPeriod {

    A(12),
    B(24),
    C(36);

    private final int value;

    CardPeriod(int value) {
        this.value = value;
    }

    public static void of(int period) {
        Arrays.stream(CardPeriod.values())
                .filter(cardPeriod -> cardPeriod.value == period)
                .peek(cardPeriod -> System.out.println(cardPeriod.value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}