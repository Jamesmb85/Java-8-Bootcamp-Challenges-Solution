package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function that determine ithe Greatest Common Divisor between 2 numbers

public class Main {


    public static void main(String[] args) {
        // write your code here


        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number you want to find a divisor for: ");

        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value1 = sc.nextInt();

        System.out.println("Enter the second number you want to find a divisor for");

        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value2 = sc.nextInt();

        //call function and assign to variable
        int result = getGreatestCommonDivisor(value1, value2);

        //print statement
        System.out.println("The Greatest Common Divisor between " + value1 + " and " + value2 + " is " + result);

    }


    public static int getGreatestCommonDivisor(int number1, int number2){

        int gcd = 0;

        //logic to test for negative numbers
        if(number1 < 0 || number2 < 0){
            System.out.println("There is no GCD for a number less than 0");
            return -1;
        }
        else{
            /*need to use a loop to see if the index divides into both numbers.
            it doesn't matter which number we use because if one number is much larger than the other
            we are only go to find the GCD that divides into both. For example, 5 and 5000 would have a GCD of 5
            if the loop is run until the index reaches 5000, the gcd doesn't change*/
            for(int i = 1; i <= number1; i++){
                if(number1%i == 0 && number2%i == 0){
                    //the gcd is updated
                    gcd = i;
                }
            }
        }

        return gcd;
    }





}







