package com.company;

//import the scanner class
import java.util.Scanner;

/*-Read 10 numbers from the console entered by the user and print the sum of those numbers.
        -Create a Scanner like we did in the previous video.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message gInvalid Numberh. Continue reading until you have read 10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message gEnter number #x:h where x represents the count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be gEnter number #1:h, the next gEnter number #2: h, and so on.

        Hint:
        -Use a while loop.
        -Use a counter variable for counting valid numbers.
        -Close the scanner after you donft need it anymore.
        -Create a project with the name ReadingUserInputChallenge.*/


public class Main {

    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        int sum = 0;

        //need to check each time if a number of invalid value is entered
        //this is an infinite loop until counter = 10 which means we entered 10 number
        while(true){

            //check to see if number was entered
            System.out.println("What number do you want to add to the sum? ");
            boolean isAnumber = sc.hasNextInt();

            if(isAnumber){
                //if a number was entered, we add it to sum
                // Numerical data input
                int number = sc.nextInt();
                System.out.println("You want to add " + number + " to the sum");
                sum += number; //increase sum  by number
                System.out.println("The sum is now " + sum);
                counter++; //increase counter by 1

                //breaking statement to get out of the loop
                if(counter == 10){
                    break;
                }

            }
            else{
                System.out.println("An invalid value was entered. The sum did not change");
                sc.nextLine();//handle next line character. When you press enter, you can input another value, if not then
            }


        }

        sc.close(); //close the scanner class


    }


}







