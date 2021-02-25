package com.baba.generics_collections.compare;

import java.util.Date;

public class CompareDate {

    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        Thread.sleep(2000);
        Date date1 = new Date();

        System.out.println(date.after(date));
    }
}
