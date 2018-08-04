package com.company;

//import the scanner class
import java.util.Scanner;

/*-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        -Before the user enters the number, print the message gEnter number:h
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

        Hint:
        -Use an endless while loop.

        Bonus:
        -Create a project with the name MinAndMaxInputChallenge.*/


public class Main {

    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        //variables
        int min = 0;
        int max = 100;

        System.out.println("The initial minimum value is: " + min);
        System.out.println("THe initial maximum value is: " + max);

        //this is an infinite loop until we reach our break condition
        while(true){

            //check to see if number was entered
            System.out.println("Enter an integer. Depending on what it is the minimum or maximum value may change: ");
            boolean isAnumber = sc.hasNextInt();

            if(isAnumber){
                //since a number was entered, we know check to see if the min, max, or no change occurs
                //read in integer
                int value = sc.nextInt();

                //test to see if value if bigger than the current max
                if(value > max){
                    System.out.println(value + " was entered");
                    max = value;

                }
                //test to see if value is smaller than the current min
                else if(value < min){
                    System.out.println(value + " was entered");
                    min = value;
                }
                //if the value equals max or min then just continue to the next iteration of the loop
                else if (value == min || value == min){
                    continue;
                }
            }
            //a value beside an integer was entered and we need to break out of the loop
            else{
                break;
            }


        }

        //if an invalid min or max value is enter then just print out the current values
        System.out.println("The current minimum value is: " + min);
        System.out.println("THe current maximum value is: " + max);

        sc.close();

    }


}







