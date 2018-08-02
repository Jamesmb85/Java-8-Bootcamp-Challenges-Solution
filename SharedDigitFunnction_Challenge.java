package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function that determine if two numbers between 10 and 99 share a digit

public class Main {


    public static void main(String[] args) {
        // write your code here


        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer you want to compare");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value1 = sc.nextInt();

        System.out.println("Enter the second integer you want to compare");


        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value2 = sc.nextInt();

        //call function and assign to variable
        boolean compare = hasSharedDigit(value1, value2);

        //print statement
        System.out.println("Do " + value1 + " and " + value2 + " share a digit? The answer is: " + compare);

    }

    public static boolean hasSharedDigit(int number1, int number2){

        //Variables containing the 1's digit
        int num1 = number1%10;
        int num2 = number2%10;

        //Variables containing the 10s digit
        int num3 = number1/10;
        int num4 = number2/10;

        //test to see if either number is out of range
        if(number1<=10 || number1>=99 || number2<=10 || number2>=99){
            System.out.println("You entered a number out of range. The answer is false");
            return false;
        }
        else{
            return ((num1 == num2 )|| (num1 == num4) || (num2 == num3) || (num3 == num4) );
        }

    }


}







