package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("WeakerAccess")
public class DateUtil
{
    //Return a LocalDate object for New Years of the given year
    public static LocalDate getNewYears(int year)
    {
        return LocalDate.of(year, 1,1);
    }

    //Return a LocalDate object for Christmas of the given year
    public static LocalDate getChristmas(int year)
    {
        return LocalDate.of(year,12,25);
    }

    //In 1999 it is time to party
    //If the given year is 1999 return true
    public static boolean isPartyTime(LocalDate date)
    {
        if(date.getYear()== 1999)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //After 1999 you are out of time
    //If the given year is after 1999 return true
    public static boolean isOutOfTime(LocalDate date)
    {
        if (date.isAfter(LocalDate.of(1999,12,31)))
        {
            return true;
        }
        return false;
    }

    //You took too long to order your soup
    //You cannot try again for one year
    //Return the given date one year from now
    public static LocalDate getSoupDay(LocalDate date)
    {
        return date.plusYears(1);
    }

    //Return a LocalDate object for the next Christmas after the given date
    public static LocalDate getNextChristmas(LocalDate date)
    {
         LocalDate nextChristmas;
         if(date.getMonthValue() ==12 && date.getDayOfMonth()>=25)
         {
             nextChristmas = LocalDate.of(date.getYear()+1,12,25);
         }
         else
         {
             nextChristmas = LocalDate.of(date.getYear(),12,25);
         }

         return nextChristmas;
    }

    //Return the number of days until Christmas
    //If it is Christmas return the number of days until the next Christmas
    public static long getDaysUntilChristmas(LocalDate date)
    {

        LocalDate nextChristmas = getNextChristmas(date);
        return ChronoUnit.DAYS.between(date,nextChristmas);
    }

    //Return a array of twelve ints holding the number of days in each month
    public static int[] daysInMonth(int year)
    {
        int[] daysInMonth = new int[12];
        for (int i = 0; i<12; i++)
        {
            LocalDate date = LocalDate.of(year,i+1,1);
            daysInMonth[i] = date.lengthOfMonth();
        }
        return daysInMonth;
    }
}
