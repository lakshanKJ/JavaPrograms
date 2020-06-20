package com.iit.se;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your Fibonacci limit: ");
    int n = in.nextInt();

    for(int i = 0; i < n ; i++) {
        int first = i;
        int second = i+1;
        int sum = first + second;
        System.out.println(sum);

    }

    }
}
