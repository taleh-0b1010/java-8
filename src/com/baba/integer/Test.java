package com.baba.integer;

import java.time.LocalDateTime;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        zxc();
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.getHour() + ":" + date.getMinute() + " " + date.getYear() + "." + date.getMonthValue() + "." + date.getDayOfMonth());
        System.out.println(LocalDateTime.now().plusSeconds(600));
    }

    private static void zxc() {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(date.getTime() + 180000);
        System.out.println(date1);
    }
}
