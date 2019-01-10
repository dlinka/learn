package com.cr;

import java.time.*;
import java.util.Calendar;
import java.util.TimeZone;

public class LearnZonedDateTime {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault());

        //Calendar转ZonedDateTime
        Calendar calendar = Calendar.getInstance();
        ZonedDateTime calendarToZonedDateTime = ZonedDateTime.ofInstant(
                Instant.ofEpochMilli(calendar.getTimeInMillis()),
                calendar.getTimeZone().toZoneId());

        //ZonedDateTime转Calendar
        ZonedDateTime now = ZonedDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone(now.getZone());
        Calendar zonedDateTimeToCalendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(now.toInstant().toEpochMilli());

    }

}
