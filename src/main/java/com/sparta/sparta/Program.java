package com.sparta.sparta;

public class Program {
    public static void main(String[] args) {

        int timeOfDay = 1;
        String message = greeting(timeOfDay);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 0 && timeOfDay  < 5) {
            greeting = "It's very late";
        }
        else if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good Morning";
        }
        else if (timeOfDay > 12 && timeOfDay <= 18) {
            greeting = "Good Afternoon";
        }
        else if (timeOfDay > 18 && timeOfDay <= 23){
            greeting = "Good Evening";
        }
        else {
            greeting = "Invalid time";
        }
        return greeting;


    }
}
