/* Write a method with the name sumDigits that has one int parameter called number. 

If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.

The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.

For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.

Calling the method sumDigits(1) should return -1 as per requirements described above.

Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.

Hint: 
	Use n % 10 to extract the least-significant digit.
	Use n = n / 10 to discard the least-significant digit.
	The method needs to be static like other methods so far in the course.

Tip: 
	Create a project with the name DigitSumChallenge. */

package com.company;

//import the scanner class
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to find the sum of it's digits: ");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int sum_of_digits = sc.nextInt();

        //call function and assign to variable
        int result = sumDigits(sum_of_digits);

        //print all sum
        System.out.println("The sum of the digits in "  + sum_of_digits + " is: " + result);

    }


    public static int sumDigits(int number){
         //test to see if number is singular
        if(number < 10){
            return -1;
        }


        //need to assign the digit to an empty variable
        int sum = 0;

        while(number > 0){

            //assign last digit in number to variable
            int last_digit = number%10;

            //add last_digit to sum
            sum += last_digit;

            //drop the least significant digit
            number = number/10;

            //number is now the digits without the last digit and this new number is used to test the loop
        }

        return sum;



    }

}







