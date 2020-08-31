package com.grz55.javatraining;

import java.util.Calendar;

public class NameOfTheDay {

    public static void main(String[] args) {
        int year = 2020;
        int month = 8;
        int day = 31;
        String[] namesOfDays = {
                "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(namesOfDays[dayOfWeek - 1]);
    }

}
