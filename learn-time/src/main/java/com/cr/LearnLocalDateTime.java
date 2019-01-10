package com.cr;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LearnLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2018, 9, 9, 9, 9, 9);
        LocalDateTime localDateTime3 = LocalDate.now().atTime(9, 9, 9);
        LocalDateTime localDateTime4 = LocalTime.now().atDate(LocalDate.of(2018, 9, 9));
        LocalDateTime localDateTime5 = LocalDateTime.now().withHour(9).withMinute(9).withSecond(9);
        LocalDateTime localDateTime6 = LocalDateTime.now().plusHours(3).plusMinutes(3);
        LocalDateTime localDateTime7 = LocalDateTime.ofInstant(Instant.ofEpochMilli(new Date().getTime()), ZoneId.systemDefault());

        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.getMonthValue());
        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getHour());
        System.out.println(localDateTime1.getMinute());
        System.out.println(localDateTime1.getSecond());
        System.out.println(localDateTime1.getDayOfWeek());

        //输出UNIX时间
        System.out.println(localDateTime1.toEpochSecond(ZoneOffset.of("+08:00")));

        //LocalDateTime与String互转
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String localDateTimeToStr = formatter.format(localDateTime1);
        LocalDateTime strToLocalDateTime = LocalDateTime.parse(localDateTimeToStr, formatter);

    }
}
