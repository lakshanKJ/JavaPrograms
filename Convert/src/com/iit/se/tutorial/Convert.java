package com.iit.se.tutorial;

public class Convert {
    public static final double MM_IN_INCH = 25.4;
    public static final double MM_IN_FOOT = 304.8;
    public static final double MM_IN_YARD = 914.4;
    public static final double MM_IN_MILE = 1609344;

    // Centimeters to Inches
    public static double cm2inches(double cm) {
        String round=String.format("%.2f",cm * 0.393);
        return Double.parseDouble(round);
    }

    public static String cm2inches(double cm , boolean addUnit) {
        String round=String.format("%.2f",cm * 0.393);
        return round+" inches";
    }

    public static double cm2inches(double cm, int rounding) {
      String round=String.format("%."+rounding+"f",cm * 0.393);
        return Double.parseDouble(round);
    }

    public static String cm2inches(double cm, int rounding, boolean addUnit) {
        String round=String.format("%."+rounding+"f",cm * 0.393);
        return round+" inches";
    }

    // Metres to Feet
    public static double m2feet(double m) {
        String round=String.format("%.2f",m * 3.281);
        return Double.parseDouble(round);
    }

    public static String m2feet(double m, boolean addUnit) {
        String round=String.format("%.2f",m * 3.281);
        return round+" feet";
    }

    public static double m2feet(double m,int rounding) {
        String round=String.format("%."+rounding+"f",m * 3.281);
        return Double.parseDouble(round);
    }

    public static String m2feet(double m,int rounding, boolean addUnit) {
        String round=String.format("%."+rounding+"f",m * 3.281);
        return round+" feet";
    }

    // Meters to Yards
    public static double m2yards(double m) {
        String round=String.format("%.2f",m * 1.094);
        return Double.parseDouble(round);
    }

    public static String m2yards(double m ,boolean addUnit) {
        String round = String.format("%.2f", m * 1.094);
        return round+" yards";
    }

    public static double m2yards(double m,int rounding) {
        String round=String.format("%."+rounding+"f",m * 1.094);
        return Double.parseDouble(round);
    }

    public static String m2yards(double m,int rounding,boolean addUnit) {
        String round = String.format("%." + rounding + "f", m * 1.094);
        return round+" yards";
    }

    // Kilometers to Miles
    public static double km2miles(double km) {
        String round=String.format("%.2f",km * 0.621);
        return Double.parseDouble(round);
    }
    public static String km2miles(double km, boolean addUnit) {
        String round=String.format("%.2f",km * 0.621);
        return round+" miles";
    }

    public static double km2miles(double km, int rounding) {
        String round=String.format("%."+rounding+"f",km * 0.621);
        return Double.parseDouble(round);
    }

    public static String km2miles(double km, int rounding, boolean addUnit) {
        String round=String.format("%."+rounding+"f",km * 0.621);
        return round+" miles";
    }
}
