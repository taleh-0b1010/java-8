package com.baba.hackerrank;

import java.util.Scanner;

public class StdInOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        Scanner scan1 = new Scanner(System.in);
        String s = scan1.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
