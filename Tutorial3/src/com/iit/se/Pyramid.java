package com.iit.se;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("How many lines? ");
    String lines = in.nextLine();

    int n = Integer.parseInt(lines);
    printPyramid(n);
    }

    public static void printPyramid(int n){

        for (int i = n; i > 0; i--){

            for (int k = n-i; k > 0; k--){
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
