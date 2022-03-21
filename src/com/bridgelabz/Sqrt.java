package com.bridgelabz;

import java.util.Scanner;

public class Sqrt {
    static void sqrt() {
        //    int c1;
        double avg = 0;
        float epsilon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int c = sc.nextInt();
        //    if(c <= 0) {
        //       System.out.println("Enter a non-Negative number: ");
        //      c1 = sc.nextInt();

        double t = c;
        avg = ((c / t) + t) / 2;
        t = avg;
        epsilon = 1 * (float) java.lang.Math.exp(-15);

        while (Math.abs(t - (c / t)) > epsilon * t) {

        }
        }

        public static void main (String[]args){
            sqrt();
        }
    }
