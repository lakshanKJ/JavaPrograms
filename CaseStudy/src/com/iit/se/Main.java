package com.iit.se;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try {
            // Get values from user
            Scanner in = new Scanner(System.in);
            System.out.println("Enter weight in pounds: ");
            double pounds = Math.abs(in.nextDouble());
            System.out.println("Enter height in inches: ");
            double inches = Math.abs(in.nextDouble());
            // Calculate BMI
            double bmi = calculateBMI(inches, pounds);

            // Categorize
            String category = categorize(bmi);

            // Display
            System.out.println("Your BMI is "+bmi);
            System.out.println(category);

        } catch (Exception ex) {
            System.out.println("Oops something went wrong!");
        }
    }
    public static double calculateBMI(double height, double weight){
        // When using English measurements, pounds should be divided by inches squared.
        // This should then be multiplied by 703 to convert from lbs/inches2 to kg/m2.

        // Formula: 703 x weight (lbs) / [height (in)]2

        return (703 * weight/(height*height));
    }
    public static String categorize(double bmi){
        String cat = "";
        if (bmi < 18.5) {
            cat="Underweight";
        } else if (18.5<=bmi && bmi<=25){
            cat= "Normal";
        } else if (25<=bmi && bmi<=30){
            cat= "Overweight";
        }else {
            cat= "Obese";
        }

        return cat;
    }
}
