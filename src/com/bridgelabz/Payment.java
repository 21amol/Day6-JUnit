package com.bridgelabz;

public class Payment {

    public static void main(String[] args) {
        int principal = Integer.parseInt(args[0]);          // Principal Amount.
        int years = Integer.parseInt(args[1]);              // Years.
        double rate = Integer.parseInt(args[2]);               // Rate of Interest.

        double r = rate / 1200;
        int n = 12 * years;
        double a = Math.pow((1 + r), -n);

        double payments = ((principal * r) / 1 - (a));
        System.out.println("The Monthly Payment is: " + payments);
    }
}
