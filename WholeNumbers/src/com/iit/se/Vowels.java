package com.iit.se;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter your word in simple letters");
    String word = in.nextLine();

    int count = 0;
    for (int i = 0; i< word.length(); i++){
        char n = word.charAt(i);
        if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
            count++;
        }
    }
    System.out.println("Number of vowels in the word is: " +count);
    }
}
