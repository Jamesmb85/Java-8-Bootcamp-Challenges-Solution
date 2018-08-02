package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function to determine if two integers are a palindrome

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer you want to see if it is a palindrome: ");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int number = sc.nextInt();

        //call function and assign to variable
        boolean result = isPalindrome(number);

        //print statement
        if(result){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }



    }


    public static boolean isPalindrome(int value){

        //declare variable we are going to compare value to
        int reverse = 0;

        int test_value = value;

        /*since a palindrome is the same number forward and backwards, we need to start at the digit in the ones
        * column and assign that to a variable. We then continue to the tens column and assign that digit to the
        * same variable. It will be assign to the right. This continues until all of the numbers are assigned to the
        * new variable and then we finally compare value to reverse
        * */

        while(test_value > 0){
            //extract the last digit of value using mod division
            int last_digit = test_value%10;

            //to increase the place value
            reverse = reverse *10;

            //add last digit to reverse
            reverse += last_digit;

            //since the last digit fo value is processed, we need to remove it from value
            test_value = test_value/10;
			
			/*Let's step through the code using the number 101 which is a palindrome
			1. test_value > 0 is true since test_value is 101
			2. last_digit is assigned the value of 1
			3. reverse is assigned the value of 1
			4. test_value is assigned the value of 10
			
			So, after iteration 1, we have last_digit = 1; reverse = 1, test_value = 10

			1. test_value > 0 is true since test_value is 10
			2. last_digit is assigned the value of 0
			3. reverse is assigned the value of 10
			4. test_value is assigned the value of 1

			So, after iteration 2, we have last_digit = 0; reverse = 10, test_value = 1

			1. test_value > 0 is true since test_value is 1
			2. last_digit is assigned the value of 1
			3. reverse is assigned the value of 101
			4. test_value is assigned the value of 0

			So, after iteration 3, we have last_digit = 1; reverse = 101, test_value = 0

			*/
        }

        return reverse == value;

    }


}







