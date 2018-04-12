package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        //call method
        int newScore =  calculateScore("James", 23);
        System.out.println("New Score is " + newScore);

        //overload the method and call it
        int secondScore = calculateScore(75);
        System.out.println("Second score is " + secondScore);

        //overload the method again and call it
        int thirdScore = calculateScore();
        System.out.println("The score was: " + thirdScore);

        //call first challenge method
        calcFeetAndInchesToCentimeters(0, 0);

        //call second challenge method
        calcFeetAndInchesToCentimeters(100);

    }


    /*  Overloading occurs when two or more methods in one class have the same method name but different parameters.

    Overriding means having two methods with the same method name and parameters (i.e., method signature).
    One of the methods is in the parent class and the other is in the child class.
    Overriding allows a child class to provide a specific implementation of a method that is already provided its parent class.*/

    public static int calculateScore(String player_name, int score){
        System.out.println("Player: " + player_name + " scored " + score + " points");
        return score * 1000;
    }

    //overload the method by changing the number of parameters
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored: "  + score + " points");
        return score * 1000;
    }

    //overload the method with no parameters
    public static int calculateScore(){
        System.out.println("No player no score");
        return 0;
    }

    //challenge method #1
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double value = 0.0;
        if(feet < 0 || inches < 0){
            System.out.println("We can't convert a negative number of feet or inches");
            return -1;
        }
        //processing is stopped if the return line is executed

        value += ( (feet*12*2.54) + (inches *2.54) );

        System.out.println(feet + " feet " + "and " + inches + " inches" + " is " + value + " centimeters");

        return value;
    }

    //challenge method #2
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("We can't convert a negative number of inches");
            return -1;
        }
        //processing is stopped if the return line is executed


        double feet_to_inches = (int) inches/12;
        double remaining_inches = (int) inches%12;

        System.out.println(inches + " inches is equal to " +  feet_to_inches + " feet and " +  remaining_inches + " inches");

        //call method calcFeetAndInchesToCentimeters and return the value
        return calcFeetAndInchesToCentimeters(feet_to_inches, remaining_inches);

    }

}

