package com.baba.date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;

public class Example {

    public static final String CACHE_PREFIX = "optimus:token";

    public static void main(String[] args) {
        long now = (new Date()).getTime();
        Date validity = new Date(now + 900 * 1000);

        long now1 = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(now + 900 * 1000), ZoneId.systemDefault());


        System.out.println(validity + "\n" + dateTime);

        System.out.println(buildBucketName("myUser"));
    }

    private static String buildBucketName(String userName) {
        return String.format("%s:%s", CACHE_PREFIX, userName);
    }
}
