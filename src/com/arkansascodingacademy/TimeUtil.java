package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("WeakerAccess")
public class TimeUtil
{
    //Return true if it is after 12PM and before 4PM
    public static boolean isAfternoon(LocalTime time)
    {

        if (time.isAfter(LocalTime.NOON)  && time.isBefore(LocalTime.of(16,0,0)))
        {
            return true;
        }
        else return false;
    }

    //Return true if it is after midnight and before 4AM
    public static boolean isAfterMidnight(LocalTime time)
    {
        if (time.isAfter(LocalTime.MIDNIGHT)  && time.isBefore(LocalTime.of(4,0,0)))
        {
            return true;
        }
        else return false;
    }
}
