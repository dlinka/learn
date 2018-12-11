package com.cr;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LearnLocalDate {

    public static void main(String[] args) {

        /**
         * 构造LocalDate
         */
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2018, 9, 9);
        LocalDate localDate3 = LocalDateTime.of(2018, 9, 9, 9, 9, 9).toLocalDate();

    }

}
