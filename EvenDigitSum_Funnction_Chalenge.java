package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function that returns the sum of all of the digits

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer to find the sum of the even digits in the integer");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int number = sc.nextInt();


        //call function and assign to variable
        int sums = getEvenDigitSum(number);

        //print statement
        System.out.println("The sum of all of the even digits in " + number + " is: " + sums);

    }


    public static int getEvenDigitSum(int value){
        //return a negative number is value is negative
        if(value < 0){
            return -1;
        }

        int sum_of_even_numbers = 0;

        //need to take the laat digit in the integer during each loop and check to see if it is divisible by 2
        while(value > 0){
            //extract the last digit of value using mod division
            int last_digit = value%10;

            //test if last_digit is even. if it is, add to sum_of_even_numbers
            if(last_digit%2 == 0){
                sum_of_even_numbers += last_digit;
            }

            //after check, drop the last digit
            //number is now the digits without the last digit and this new number is used to test the loop
            value = value/10;
        }

        return sum_of_even_numbers;
    }


}







