package com.iit.se;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("how many lines? ");
	String lines = in.nextLine();

	int n = Integer.parseInt(lines);
    printStars(n);
    }

    public static void printStars(int n) {
        int i, j;
        for (i = 0; i<n; i++){
            for (j = 0; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
