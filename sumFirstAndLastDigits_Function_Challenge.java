package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function that sum the first and last digits of a number

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer you want to find the sum of the first and last digits ");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int number = sc.nextInt();


        //call function and assign to variable
        int sum_of_digits = sumFirstAndLastDigits(number);

        //print sum
        System.out.println("The sum of the first and last digits of " + number + " is: " + sum_of_digits);


    }


    //Write a function that sum the first and last digits of a number
    public static int sumFirstAndLastDigits(int value){
        //logic to account for single and positives
        if(value <10 && value >= 0){
            return value*2;
        }

        //logic to account for negative numbers
        if(value < 0){
            return -1;
        }

        /*logic to account for all values 10 and greater
        10 would return the sum 1
        11 would return the sum 2
        101 would return the sum 2*/

        //last digit is extracted before entering loop
        int last_digit = value%10;

        //first digit is unknown at this point but will be assigned after the loop
        int first_digit = 0;

        //loop to get dividing the number by 10 until you get to the first digit
        while(value > 0){
            first_digit = value%10;
            value = value/10;
			
			/*Let's step through the code using the number 101 
			Outside of the loop first_digit = 0
			
			1. value > 0 is true since value is 101
			2. first_digit = 1
			3. value = 10
			
			So, after iteration 1, we have first_digit = 1; value = 10;
			
			1. value > 0 is true since value is 10
			2. first_digit = 0
			3. value = 1
			
			So, after iteration 2, we have first_digit = 0; value = 1;
			
			1. value > 0 is true since value is 1
			2. first_digit = 1
			3. value = 0
			
			So, after iteration 3, we have first_digit = 1; value = 0;
			
			There is no iteration 4 since value = 0 > 0 is not true

			*/

        }

        return first_digit + last_digit;
		//we get first_digit = 1 and last_digit = 1 and 2 is return


    }


}







