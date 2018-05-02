package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilTest
{
    private static LocalTime JUST_AFTERNOON = LocalTime.of(12,0,1);
    private static LocalTime ALMOST_END_AFTERNOON = LocalTime.of(15,59,59);
    private static LocalTime END_AFTERNOON = LocalTime.of(16,0,0);

    private static LocalTime JUST_AFTER_MIDNIGHT = LocalTime.of(0,0,1);
    private static LocalTime ALMOST_MORNING = LocalTime.of(3,59,59);
    private static LocalTime MORNING = LocalTime.of(4,0,0);

    @Test
    void isAfternoon()
    {
        assertFalse(TimeUtil.isAfternoon(LocalTime.NOON));
        assertTrue(TimeUtil.isAfternoon(JUST_AFTERNOON));
        assertTrue(TimeUtil.isAfternoon(ALMOST_END_AFTERNOON));
        assertFalse(TimeUtil.isAfternoon(END_AFTERNOON));
    }

    @Test
    void isAfterMidnight()
    {
        assertFalse(TimeUtil.isAfterMidnight(LocalTime.MIDNIGHT));
        assertTrue(TimeUtil.isAfterMidnight(JUST_AFTER_MIDNIGHT));
        assertTrue(TimeUtil.isAfterMidnight(ALMOST_MORNING));
        assertFalse(TimeUtil.isAfterMidnight(MORNING));
    }
}