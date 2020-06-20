package com.iit.se;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first number");

        String first = in.nextLine();

        try{
            Integer.parseInt(first);
            System.out.println("This is a Whole number");
        } catch (Exception ex) {
            System.out.println("This is not a whole number");
        }

        System.out.println("\nEnter your second number");

        String second = in.nextLine();
        try {
            Integer.parseInt(second);
            System.out.println("This is a whole number");
        }catch (Exception ex) {
            System.out.println("This is not a whole number");
        }
    }
}
