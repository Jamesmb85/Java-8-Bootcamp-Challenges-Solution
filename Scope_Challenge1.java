package com.company;

import java.util.Scanner;

public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    static int x;

    public static void main(String[] args) {
	// write your code here
        // Write a small program to read an integer from the keyboard
        // (using Scanner) and print out the times table for that number.
        // The table should run from 1 to 12.
        //
        // You are allowed to use one variable called scanner for your
        // Scanner instance. You can use as many other variables as you
        // need, but they must must all be called x. That includes any
        // class instances and loop control variables that you may decide
        // to use.
        //
        // If you use a class, the class can be called X (capital), but
        // any instances of it must be called x (lower case).
        //
        // Any methods you create must also be called x.
        //
        // Optional Extra:
        // Change your program so that ALL variables (including the scanner
        // instance) are called x.

        System.out.println("Enter your number: ");
        Main.x = sc.nextInt();

        System.out.println("The multiplication table from 1 through 12 is: ");
        System.out.println("=================================================");

        for(int x = 1; x <= 12; x++){
            System.out.println(Main.x + " x " + x + " = " + (Main.x * x));
        }

        System.out.println("=================================================");

    }

}
