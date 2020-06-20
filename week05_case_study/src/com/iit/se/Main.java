package com.iit.se;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float total = 0;
        float count = 0;
        float mark = 0;

        Scanner in = new Scanner(System.in);

        while (mark >= 0 && mark < 101) {
            System.out.println("Enter your marks, Please enter a negative mark to end the process");

            mark = in.nextFloat();
//          break
            if (mark < 0 || mark > 100) {
                break;
            }
            total = total + mark;
            count = count + 1;
        }
        System.out.print("Your average is: "+calculate(total,count));
    }
//Finding average
    public static float calculate(float total, float count){
        float avg = total/count;
        return avg;
    }

}
