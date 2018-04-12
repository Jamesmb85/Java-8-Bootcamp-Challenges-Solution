package com.company;

//import the scanner class
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	    // write your code here

        //call method and assign it to an array
        int[] testArray = getArray(4);

        //call method
        printArray(testArray);

        System.out.println("\n");

        //call method
        int[] newArray = sortedArray(testArray);

        //call method
        printArray(newArray);

    }

    //method to take an array as a parameter, fill it in, and return it
    private static int[] getArray(int arraySize){
        //define the array to be return. Type is int and size is parameter arraySize
        int[] myArray = new int[arraySize];
        System.out.println("Type " + arraySize + " numbers into the array");

        //use loop to fill in array
        for(int i = 0; i < myArray.length; i++){
            // Numerical data input
            myArray[i] = sc.nextInt();
        }

        return myArray;
    }

    //method to take an Array as an input and print it contents
    private static void printArray(int[] sampleArray){
        for (int j = 0; j < sampleArray.length; j++){
            System.out.println("Number at index " + j + " is " + sampleArray[j]);
        }

    }

    //method to print the element of the array from largest to smallest
    //can use the bubble sort or another algorithm, but i will just use the sort method
    private static int[] sortedArray(int[] unsortedArray){
        int[] bigTosmallArray = new int[unsortedArray.length];
        int counter = 0;

        //call the sort method
        Arrays.sort(unsortedArray);


        //use loop to start at the end of the Array and print all of the elements ending at the first element
        for (int k = bigTosmallArray.length - 1; k >= 0; k-- ){
            //take the first element of the sorted Array, which is the smallest, and place it in the last element of the new array
            // bigTosmallArray is moving forward and unsortedArray is moving backwards
            bigTosmallArray[counter] = unsortedArray[k];
            counter++;
        }

        return bigTosmallArray;

    }

}
