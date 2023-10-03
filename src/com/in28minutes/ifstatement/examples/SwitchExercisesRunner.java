package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

    public static void main(String[] args) {

        System.out.println(determinNameOfDay(5));
        System.out.println(isWeekDay(4));

        boolean a = false;
        int i = 5;
        a = (((i % 2) == 0) ? true : false);
        System.out.println(i%2);
        System.out.println(a);
    }

    public static String determinNameOfDay(int dayNumber){
        switch(dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Fridday";
            case 6:
                return "Saturday";
        }
        return null;
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 0,6 : return false;
            case 1,2,3,4,5 : return true;
        }
        return false;
    }
}
