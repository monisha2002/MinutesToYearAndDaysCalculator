package com.company;

public class MinutesToYearsDaysCalculator {



    public static void printYearsAndDays (long minutes) {

        if (minutes >= 525600) {

            long hours = minutes / 60;
            long days = hours / 24;
            long year = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        } else if (minutes >= 0 && minutes < 525600) {
            long hours = minutes / 60;
            long days = hours / 24;

            System.out.println(minutes + " min = " + "0" + " y and " + days + " d");
        }
        else {
            System.out.println("Invalid Value");
        }

    }


}
