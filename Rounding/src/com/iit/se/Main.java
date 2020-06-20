package com.iit.se;
import java.text.NumberFormat;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double x=1234567.456;
        double RoundedX=Math.round(x*10)/10.0;
        NumberFormat nf = NumberFormat.getInstance(new Locale("en","US"));
        String val = nf.format(RoundedX);
        System.out.println(val);
    }
}