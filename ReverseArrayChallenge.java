/* -Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef */
	
package com.company;

import java.util.Scanner;


public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.println("What is the size of the array: ");

        int arraySize = sc.nextInt();
        

        //define array of size arraySize
        int[] testArray = new int[arraySize];

        //fill in the array
        for(int j = 0; j < testArray.length; j++){
            System.out.println("Entering #" + j);
            //fill in the array using numerical input
            testArray[j] = sc.nextInt();
        }

        //print reverse array
        reverse(testArray);


    }

    public static void reverse(int[] input){
        //since function doesn't have a return type we can just print out the result
        for(int i = input.length - 1; i >= 0; i--){
            //int i = input.length - 1 is the last element in the array and we are going from right to left
            System.out.print(input[i] + " "); //print elements on the same line
        }
    }


}







