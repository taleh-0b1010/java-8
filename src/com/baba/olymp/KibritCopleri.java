package com.baba.olymp;

import java.util.Scanner;

public class KibritCopleri {

    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int kubes = scanner.nextInt();
        int ayriCopler = kubes * 12;
        int ortaqCopler = (kubes - 1) * 4;
        int copler = ayriCopler - ortaqCopler;
        System.out.println(copler);
    }

    public static void main(String[] args) {
        calculate();
    }
}
