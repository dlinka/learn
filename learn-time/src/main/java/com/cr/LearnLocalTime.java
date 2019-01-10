package com.cr;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LearnLocalTime {

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(9, 9, 9);
        LocalTime localTime3 = LocalDateTime.of(2018, 9, 9, 9, 9, 9).toLocalTime();

    }

}
