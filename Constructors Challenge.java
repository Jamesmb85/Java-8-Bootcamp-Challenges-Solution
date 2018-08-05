  // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.



///////////////////////Constructor Challenge//////////////////////////////
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        //create an object of type VIP_Customer and initialize it with the new keyword
        //instantiation via new operator and
        //initialization via default constructor of class VIP_Customer
        VIP_Customer james = new VIP_Customer();
        System.out.println("The customer is " + james.getName());
        System.out.println("The customer's credit limit is " + james.getCredit_limit());
        System.out.println("The customer's email is " + james.getEmail());

        //just need a space to make it more readable
        System.out.println("\n");

        //call the overload constructor that has 1 default value
        VIP_Customer billy = new VIP_Customer("Mr. Banks", 10000);
        System.out.println("The customer is " + billy.getName());
        System.out.println("The customer's credit limit is " + billy.getCredit_limit());
        System.out.println("The customer's email is " + billy.getEmail());

        //just need a space to make it more readable
        System.out.println("\n");

        //call the second overload constructor that saves all of the values
        VIP_Customer joey  = new VIP_Customer("Mr. Smith", 99999, "myemail@aol.com");
        System.out.println("The customer is " + joey.getName());
        System.out.println("The customer's credit limit is " + joey.getCredit_limit());
        System.out.println("The customer's email is " + joey.getEmail());


    }
}



package com.company;

public class VIP_Customer {

    //variables
    private String name;
    private int credit_limit;
    private String email;

    /*  Each time an object is created using new() keyword at least one constructor (it could be default constructor) is invoked to assign initial values
    to the data members of the same class.

    Constructor(s) of a class must has same name as the class name in which it resides.

    A constructor in Java can not be abstract, final, static and Synchronized.

    Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.*/


   /* No-argument constructor: A constructor that has no parameter is known as default constructor.
    If we don’t define a constructor in a class, then compiler creates default constructor(with no arguments) for the class.
    And if we write a constructor with arguments or no-argument then compiler does not create default constructor.
    Default constructor provides the default values to the object like 0, null etc. depending on the type.*/

    //default constructor
    VIP_Customer(){
        //run this line if when you want to create an object using the default constructor, you want to call another constructor but pass it specific values
        //this line will call parameterized constructor below that has all of the parameters
        this("Big Baller", 100000, "hqcompanyemail@home.com");//default values of default constructor

        System.out.println("Default constructor called");
    }


     /*Parameterized Constructor: A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class
    with your own values, then use parameterized constructor*/

    // Parameterized constructor would initialized data members
    // with the values of passed arguments while
    // object of that class created.

    //pass in two values. The default value will be the email
    VIP_Customer(String name, int credit_limit){
        //this line will call parameterized constructor below that has all of the parameters
        this(name, credit_limit, "headquarters@hq.com");//default email is passed
        System.out.println("Overload constructor #1 called");
    }

    //save all of the fields
    VIP_Customer(String name, int credit_limit, String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("Overload constructor #2 called");
    }


    //getters
    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}


///////////////////////Constructor Challenge//////////////////////////////
