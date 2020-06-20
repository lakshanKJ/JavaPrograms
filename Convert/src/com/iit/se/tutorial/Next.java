package com.iit.se.tutorial;

public class Next {
    public static void main(String[] args) {
        System.out.println("20 metres is "+ Convert.m2feet(20));
        System.out.println("4 miles is ,"+ Convert.MM_IN_MILE * 4+", millimetres.");
        System.out.println("7 cm is "+ Convert.cm2inches(7,3,true));
        System.out.println("10 metres is "+ Convert.m2yards(10,1));
        System.out.println("5 metres is "+ Convert.m2feet(5,0,true));
        System.out.println("4 km is "+ Convert.km2miles(2,true));

    }
}
