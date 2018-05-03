package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilTest
{

    @Test
    void isHappyHour()
    {

        LocalDateTime fridayNotHappyHour = LocalDateTime.of(2018,5, 4, 8,0);
        LocalDateTime fridayHappyHour = LocalDateTime.of(2018,5, 4, 17,0);
        assertFalse(DateTimeUtil.isHappyHour(fridayNotHappyHour));
        assertTrue(DateTimeUtil.isHappyHour(fridayHappyHour));

    }
}