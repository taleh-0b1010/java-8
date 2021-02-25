package com.baba.integer;

import java.math.BigDecimal;

public class IntegerToBigDecimal {

    public static void main(String[] args) {
        Integer i = 180;
        BigDecimal bd = BigDecimal.valueOf(((double) i) / 100);
        System.out.println(bd);
    }
}
