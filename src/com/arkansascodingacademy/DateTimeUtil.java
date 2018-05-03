package com.arkansascodingacademy;
import java.time.LocalDateTime;





@SuppressWarnings("WeakerAccess")
public class DateTimeUtil
{
    //Return true is it is happy hour
    //Happy hour is 4 to 7 Mon-Thur and 4 to 6 on Friday
    public static boolean isHappyHour(LocalDateTime dateTime)
    {
        boolean isHappyHour = false;
switch(dateTime.getDayOfWeek())
{

    case MONDAY:
    case TUESDAY:
    case WEDNESDAY:
    case THURSDAY:
        if(dateTime.getHour()> 16 && dateTime.getHour()<= 19)
            isHappyHour = true;
        break;
    case FRIDAY:
        if(dateTime.getHour()> 16 && dateTime.getHour()<= 18)
        {
            isHappyHour = true;
        }
        break;
    case SATURDAY:
    case SUNDAY:
         isHappyHour = false;

}
return isHappyHour;
    }

}
