package com.cybertek.officeHour;

public class library {

    public static void sleep(double a) {

        try {

            Thread.sleep((long) a * 1000);

        } catch (InterruptedException e) {

        }
    }
}