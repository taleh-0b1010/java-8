package com.baba.olymp;

import java.math.BigDecimal;

public class BigIn {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(5);
        Integer i = Integer.valueOf(String.valueOf(b));
        System.out.println(i);
    }
}
