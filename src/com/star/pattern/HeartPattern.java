package com.star.pattern;

public class HeartPattern {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;
        //upperpart
        for (i = n / 2; i <= n; i += 2) {
            for (j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part

        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

