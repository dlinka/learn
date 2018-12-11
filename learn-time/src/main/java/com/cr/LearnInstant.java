package com.cr;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class LearnInstant {

    public static void main(String[] args) {

        /**
         * 构造Instant
         */
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());
        Instant instant3 = LocalDateTime.now().toInstant(ZoneOffset.of("+08:00"));
        Instant instant4 = Instant.ofEpochMilli(new Date().getTime());
        Instant instant5 = ZonedDateTime.now().toInstant();

        /**
         * 输出UNIX时间
         */
        System.out.println(instant1.getEpochSecond());
        System.out.println(instant1.toEpochMilli());

    }

}
