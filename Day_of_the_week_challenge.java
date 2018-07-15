/* Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

The method should not return any value (hint: void)

Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.

Bonus: 
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh
 */
 
package com.company;

//import the scanner class
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        //prompt the user
        System.out.println("Enter a number from 1 to 7 to find out what day of the week it is: ");

        // Numerical data input
        //To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
        int day_of_week = sc.nextInt();

        //call method
        printDayOfTheWeek(day_of_week);

    }

    //define method
    public static void printDayOfTheWeek(int day){
        //use a switch statement
        switch(day){
            case 1:
                System.out.println("Today is Sunday ");
                break;
            case 2:
                System.out.println("Today is Monday ");
                break;
            case 3:
                System.out.println("Today is Tuesday ");
                break;
            case 4:
                System.out.println("Today is Wednesday ");
                break;
            case 5:
                System.out.println("Today is Thursday ");
                break;
            case 6:
                System.out.println("Today is Friday ");
                break;
            case 7:
                System.out.println("Today is Saturday ");
                break;
            default:
                System.out.println("Error!!! You didn't enter a number from 1-7");
        }


    }



}



