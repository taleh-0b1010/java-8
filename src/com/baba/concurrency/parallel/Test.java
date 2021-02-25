package com.baba.concurrency.parallel;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) throws ParseException {
        LocalDateTime dateTime = LocalDateTime.now();
        Date sqlDate = Date.valueOf(dateTime.toLocalDate());
        System.out.println(sqlDate);

        System.out.println(Timestamp.valueOf("2020-08-08 08:08:08.000001"));




        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        String dateStr = "2020-08-08 08:08:08.000001";
        java.util.Date date = sdf.parse(dateStr);
        System.out.println(new Date(date.getTime()));
    }
}