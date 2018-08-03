package com.company;

//import the scanner class
import java.util.Scanner;

//Write a function that prints out all of the factors of a number

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to find the factors of: ");

        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
        int value = sc.nextInt();

        //call function
        printFactors(value);

    }


    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value.");
        }
        else{
            for(int i = 1; i <= number; i++){
                //if index divides into number eqaully, then it is a factor
                if(number%i == 0){
                    System.out.println(i + " is a factor of " + number);
                }
            }
        }
    }



}







