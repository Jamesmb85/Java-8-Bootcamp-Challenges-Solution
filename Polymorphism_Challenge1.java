// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).


package com.company;

//import the scanner class
import java.util.Scanner;

//////////////////////////////////////////////////////////////classes///////////////////////////////////////////////////
class Car {
    //variables(states)
    private boolean Engine;
    private int cylinders;
    private int wheels;
    private String name;

    //overload constructor
    public Car(int cylinders, String name) {
        //this keyword means the variable(private int cylinders) is updated with the parameter(int cylinders) in the method
        //during code execution, this.cylinders is replaced by object.cylinders, and engine on the left hand side is the instance variable
        //and engine on the right side is the local variable(parameter)
        this.cylinders = cylinders;
        this.name = name;
        this.Engine = true;
        this.wheels = 4;
    }

    //getters
    public boolean isEngine() {
        return Engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    //methods
    public String startEngine() {
        return "The engine from the Car base class is used!!!";
    }

    public String accelerate() {
        return "Car can usually accelerate from 0 to 60mph in less than 5 seconds";
    }

    public String brake(){
        return "Cars usually have anti-lock brakes";
    }
}

class Honda extends Car{

    //overload constructor
    public Honda() {
        /*super keyword can also be used to access the parent class constructor.
        invoke or call parent class constructor
        Call to super() must be first statement in Derived(Student) Class constructor.
        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
        If the superclass does not have a no-argument constructor, you will get a compile-time error.
        Object does have such a constructor, so if Object is the only superclass, there is no problem.*/
        super(4, "Honda Accord");
        //we are initializing the variables from the base class
    }

    //override the methods
    @Override
    public String startEngine() {
        return "Hondas have 4 Cylinders";
    }

    @Override
    public String accelerate() {
        return "Hondas can go from 0 to 60mph in about 4 seconds";
    }

    @Override
    public String brake() {
        return "Hondas brake pads are built in Japan";
    }
}


class Acura extends Car{
    //default constructor
    public Acura() {
        super(6, "Acrua Srx");
    }

    //override the methods
    @Override
    public String startEngine() {
        return "Acura have 6 Cylinders";
    }

    @Override
    public String accelerate() {
        return "Acura can go from 0 to 60mph in about 4 seconds";
    }

    @Override
    public String brake() {
        return "Acura brake pads are built in Japan";
    }
}


class BMW extends Car{
    //overload constructor
    public BMW() {
        super(8, "BMW Coupe");
    }

    //override the methods
    @Override
    public String startEngine() {
        return "BMW have 8 Cylinders";
    }

    @Override
    public String accelerate() {
        return "BMW can go from 0 to 60mph in about 3 seconds";
    }

    @Override
    public String brake() {
        return "BMW brake pads are built in Germany";
    }
}


//////////////////////////////////////////////////////////////classes///////////////////////////////////////////////////
public class Main {

    public static void main(String[] args) {
	    // write your code here

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
        Scanner sc = new Scanner(System.in);

        //prompt the user
        System.out.println("What's type of care do you want to rent. You can rent a Honda, Acura, or BMW? "); //sout with a tab is a shortcut for this

        System.out.println("Enter a 1 for Honda, 2 for Acura, or 3 for a BMW: "); //sout with a tab is a shortcut for this\nr BMW?

        // Numerical data input
       int rental = sc.nextInt();

        //swtich statement to determine which class to call and create an instance off
        switch(rental){
            case 1:
                Car cheapRental = new Honda();
                //create an object of type Car and initialize it with the new keyword
                //instantiation via new operator and
                //initialization via default constructor of class Car
                System.out.println("You rented a " + cheapRental.getName() + "\n"
                                   + cheapRental.startEngine() + " cylinders " + "\n"
                                   + cheapRental.accelerate() + " \n"
                                   + cheapRental.brake() );
                break;
            case 2:
                Car decentRental = new Acura();
                System.out.println("You rented a " + decentRental.getName() + "\n"
                        + decentRental.startEngine() + " cylinders " + "\n"
                        + decentRental.accelerate() + " \n"
                        + decentRental.brake() );
                break;
            case 3:
                Car expensiveRental = new BMW();
                System.out.println("You rented a " + expensiveRental.getName() + "\n"
                        + expensiveRental.startEngine() + " cylinders " + "\n"
                        + expensiveRental.accelerate() + " \n"
                        + expensiveRental.brake() );
                break;
            default:
                System.out.println("You didn't enter a valid number so you can't win a car");

        }
    }

}
