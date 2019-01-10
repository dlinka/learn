package com.cr;

import java.time.ZoneId;

public class LearnZoneId {

    public static void main(String[] args) {

        ZoneId zoneId1 = ZoneId.systemDefault();
        ZoneId zoneId2 = ZoneId.of("GMT+08:00");
        ZoneId zoneId3 = ZoneId.of("Asia/Shanghai");

    }

}
