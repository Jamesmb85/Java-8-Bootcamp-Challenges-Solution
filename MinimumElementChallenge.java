/* -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter. 

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips: 
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
 */
 
package com.company;

import java.util.Scanner;


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here


        //how large do you want the array to be
        System.out.println("What is the size of the array you want to use: ");

        int input = sc.nextInt();

        //call method that will return an array and assign to array
        int[] testArray = readIntegers(input);

        //call method that will return small number in array and assign to variabl
        int smallestNumber = findMin(testArray);

        //print statement
        System.out.println("The smallest element in the array is: " + smallestNumber);

    }


    //method that reads in integers and places them in the array and return the array
    public static int[] readIntegers(int count){
        System.out.println("Please enter in: " + count + " integers");

        int[] filledInArray = new int[count]; //create array of size count

        //fill in the array
        for(int i = 0; i < count; i++){
            System.out.println("Entering #" + i);
            //fill in the array using numerical input
            filledInArray[i] = sc.nextInt();
        }

        //return the array
        return filledInArray;

    }

    //method that returns the minimum element in the array
    public static int findMin(int[] inputArray){
        //let's use the bubble sort to sort the array
        int n = inputArray.length;
        /*
          Let's assume inputArray.length is 5

          Below is how the loops are iterating

          Pass 1 -> i = 0, j varies from 0 to 5
        * Pass 2 -> i = 1, j varies from 0 to 4
        * Pass 3 -> i = 2, j varies from 0 to 3
        * Pass 4 -> i = 3, j varies from 0 to 2
        * Pass 5 -> i = 4, j varies from 0 to 1*/
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                //do the comparison
                if(inputArray[j] > inputArray[j+1]){
                    // swap temp and arr[i]
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }

        //after array is sorted, the smallest element is the first element

        int smallest = inputArray[0];

        return smallest;

    }

}







