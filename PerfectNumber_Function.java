package com.company;

//import the scanner class
import java.util.Scanner;

/*Write a function that determines if the input is a perfect number

        What is a perfect number?

        A perfect number is a whole number, an integer greater than zero; and

        when you add up all of the factors less than that number, you get that number.

        Examples:

        The factors of 6 are 1, 2, 3 and 6.
        1 + 2 + 3 = 6

        The factors of 28 are 1, 2, 4, 7, 14 and 28.
        1 + 2 + 4 + 7 + 14 = 28

        The factors of 496 are 1, 2, 4, 8, 16, 31, 62, 124, 248 and 496.
        1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496

        The factors of 8128 are 1, 2, 4, 8, 16, 32, 64, 127, 254, 508, 1016, 2032, 4064 and 8128. I'll let you add them up.*/

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to determine if it is a perfect number: ");

        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value = sc.nextInt();

        //assign function to variable
        boolean perfect = isPerfectNumber(value);

        //print statement
        System.out.println("Is " + value + " a perfect number? " + perfect);

    }


    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if(number < 1){
            return false;
        }
        else{
            //test to the value less than number since a perfect number doesn't include the number itself
            for(int i = 1; i < number; i++){
                if(number%i == 0){
                    //add the index to the sum variable
                    sum += i;
                }
            }

            //after the loop
            //if the sum of the divisors equal the number then it is a perfect number
            if(sum == number){
                return true;
            }
        }

        return false;

    }



}







