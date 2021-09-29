package com.programming;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {
//        Using the input from the user for the power of 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N [2^N] :");
        int N = sc.nextInt();
        int powerOf2=0;
//       Checking for the valid value entered by the user
        if (0 < N && N <= 31) {                                                     // We need to print the table for the powers of 2 starting from 1 till N.

            for (int i=1; i<=N;i++)
            {
                powerOf2 = (int) Math.pow(2, i);
                System.out.println("2^"+i+" is = " + powerOf2);
            }
        }
        else {                                                                     // Asking user to enter the valid value of N as defined in the range.
            System.out.println("Enter the valid number");
        }
    }
}
