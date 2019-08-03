package com.cybertek.officeHour;

public class swap{
    public static void main (String args[])
    {
     int    x = 20;
       int  y =30;
        System.out.println("Numbers before swapping");
        System.out.println(" number x is " + x);
        System.out.println("number y is " +y);
// Swapping numbers
        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println("Numbers after swapping");
        System.out.println(" number x is " + x);
        System.out.println("number y is " +y);
    }
}

