package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest
{
    private static final LocalDate NEW_YEARS_1998 = LocalDate.of(1998,1,1);
    private static final LocalDate NEW_YEARS_1999 = LocalDate.of(1999,1,1);
    private static final LocalDate NEW_YEARS_2000 = LocalDate.of(2000,1,1);
    private static final LocalDate CHRISTMAS_1999 = LocalDate.of(1999,12,25);
    private static final LocalDate CHRISTMAS_2000 = LocalDate.of(2000,12,25);
    private static final LocalDate CHRISTMAS_2004 = LocalDate.of(2004,12,25);
    private static final LocalDate CHRISTMAS_EVE_1999 = LocalDate.of(1999,12,24);
    private static final LocalDate CHRISTMAS_EVE_2000 = LocalDate.of(2000,12,24);

    @Test
    void getNewYears()
    {
        assertEquals(NEW_YEARS_1999, DateUtil.getNewYears(1999));
        assertEquals(NEW_YEARS_2000, DateUtil.getNewYears(2000));
    }

    @Test
    void getChristmas()
    {
        assertEquals(CHRISTMAS_1999, DateUtil.getChristmas(1999));
        assertEquals(CHRISTMAS_2000, DateUtil.getChristmas(2000));
    }

    @Test
    void getSoupDay()
    {
        assertEquals(NEW_YEARS_2000, DateUtil.getSoupDay(NEW_YEARS_1999));
        assertEquals(CHRISTMAS_2000, DateUtil.getSoupDay(CHRISTMAS_1999));
        assertEquals(CHRISTMAS_EVE_2000, DateUtil.getSoupDay(CHRISTMAS_EVE_1999));
    }

    @Test
    void isPartyTime()
    {
        assertFalse(DateUtil.isPartyTime(NEW_YEARS_1998));
        assertTrue(DateUtil.isPartyTime(NEW_YEARS_1999));
        assertFalse(DateUtil.isPartyTime(NEW_YEARS_2000));
    }

    @Test
    void isOutOfTime()
    {
        assertFalse(DateUtil.isOutOfTime(NEW_YEARS_1998));
        assertFalse(DateUtil.isOutOfTime(NEW_YEARS_1999));
        assertTrue(DateUtil.isOutOfTime(NEW_YEARS_2000));
    }

    @Test
    void getNextChristmas()
    {
        assertEquals(CHRISTMAS_2000, DateUtil.getNextChristmas(NEW_YEARS_2000));
        assertEquals(CHRISTMAS_2000, DateUtil.getNextChristmas(CHRISTMAS_1999));
    }

    @Test
    void getDaysUntilChristmas()
    {
        assertEquals(1, DateUtil.getDaysUntilChristmas(CHRISTMAS_EVE_2000));
        assertEquals(366, DateUtil.getDaysUntilChristmas(CHRISTMAS_1999));
        assertEquals(365, DateUtil.getDaysUntilChristmas(CHRISTMAS_2000));
        assertEquals(365, DateUtil.getDaysUntilChristmas(CHRISTMAS_2004));
    }

    @Test
    void daysInMonth()
    {
        int answer1999[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int answer2000[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        assertArrayEquals(answer1999, DateUtil.daysInMonth(1999));
        assertArrayEquals(answer2000, DateUtil.daysInMonth(2000));
    }

}