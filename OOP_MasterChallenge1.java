// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you 
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for 
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.


package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Hamburger mcdonalds = new Hamburger("Basic", "Single  Patty", 3.99, "Kaiser");
        //create an object of type Hamburger and initialize it with the new keyword
        // instantiation via new operator and
        //initialization via overload constructor of class Hamburger

        mcdonalds.addExtraIngredients1("Bacon", 2.99);
        mcdonalds.addExtraIngredients2("Cheese", .45);
        mcdonalds.addExtraIngredients3("BBQ Sauce", .50);
        mcdonalds.addExtraIngredients4("Double Patty", 1.99);

        System.out.println("Price of burger is now " + mcdonalds.itemizerHamburger() );
        System.out.println("\n");

        HealthyBurger burgerKing = new HealthyBurger("Tofu", 7.99);
        burgerKing.addExtraHealthyTopping1("Flax Seed", 1.99);
        burgerKing.addExtraHealthyTopping2("Coconut", 2.99);

        System.out.println("Price of burger is now " + burgerKing.itemizerHamburger() );

        System.out.println("\n");

        DeluxeBurger hardees = new DeluxeBurger();
        hardees.itemizerHamburger();
        hardees.addExtraIngredients1("Peppers", .99);







    }
}

//////////////////////////////////////////////////////////////classes///////////////////////////////////////////////////
package com.company;

public class Hamburger {
    //variables
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    //extra ingredients
    private String extraIngredients1;
    private double extraIngredients1Price;

    private String extraIngredients2;
    private double extraIngredients2Price;

    private String extraIngredients3;
    private double extraIngredients3Price;

    private String extraIngredients4;
    private double extraIngredients4Price;

    //overload constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        //this keyword means the variable( private String name) is updated with the parameter(String name) in the method
        //during code execution, this.name is replaced by obj.name, and name on the left hand side is the instance variable
        //and name on the right side is the local variable(parameter)
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    //methods
    public void addExtraIngredients1(String name, double price){
        this.extraIngredients1 = name;
        this.extraIngredients1Price = price;
    }

    public void addExtraIngredients2(String name, double price){
        this.extraIngredients2 = name;
        this.extraIngredients2Price = price;
    }

    public void addExtraIngredients3(String name, double price){
        this.extraIngredients3 = name;
        this.extraIngredients3Price = price;
    }

    public void addExtraIngredients4(String name, double price){
        this.extraIngredients4 = name;
        this.extraIngredients4Price = price;
    }

    public double itemizerHamburger(){
        //initial price of the hamburger is the hamburger with no toppings
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll. The price is " + this.price);

        //need to test if each item was ordered, and if ti was the price needs to increase
        if(this.extraIngredients1 != null){
            //increase hamburger price
            hamburgerPrice += this.extraIngredients1Price;
            System.out.println("Added " + this.extraIngredients1 + " to my hamburger for an extra " + this.extraIngredients1Price);
        }

        if(this.extraIngredients2 != null){
            //increase hamburger price
            hamburgerPrice += this.extraIngredients2Price;
            System.out.println("Added " + this.extraIngredients2 + " to my hamburger for an extra " + this.extraIngredients2Price);
        }

        if(this.extraIngredients3 != null){
            //increase hamburger price
            hamburgerPrice += this.extraIngredients3Price;
            System.out.println("Added " + this.extraIngredients3 + " to my hamburger for an extra " + this.extraIngredients3Price);
        }


        if(this.extraIngredients4 != null){
            //increase hamburger price
            hamburgerPrice += this.extraIngredients4Price;
            System.out.println("Added " + this.extraIngredients4 + " to my hamburger for an extra " + this.extraIngredients4Price);
        }

        return hamburgerPrice;

    }
}

//////////////////////////////////////////////////////////////classes///////////////////////////////////////////////////
package com.company;

public class HealthyBurger extends Hamburger {
    //variables
    private String extraHealthyTopping1;
    private double extraHealthyPrice1;
    private String extraHealthyTopping2;
    private double extraHealthyPrice2;

    //only two values in constructor, meat and price
    //need to call the parent class constructor
    public HealthyBurger(String meat, double price){
        /*super keyword can also be used to access the parent class constructor.
        invoke or call parent class constructor
        Call to super() must be first statement in Derived(Student) Class constructor.
        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
        If the superclass does not have a no-argument constructor, you will get a compile-time error.
        Object does have such a constructor, so if Object is the only superclass, there is no problem.*/
        super("Healthy", "Tofu", 4.99, "Wheat Bread");
        //name, meat, price, and breadRollType are initialized above
    }

    //methods
    public void addExtraHealthyTopping1(String name, double price){
        this.extraHealthyTopping1 = name;
        this.extraHealthyPrice1 = price;
    }

    public void addExtraHealthyTopping2(String name, double price){
        this.extraHealthyTopping2 = name;
        this.extraHealthyPrice2 = price;
    }

    //need to override the itemizerHamburger method to add ingredients above
    @Override
    public double itemizerHamburger() {
        double healthyHamburgerPrice =  super.itemizerHamburger();
        //super.itemizerHamburger() is returning the hamburger price that includes the four other toppings
        //that number will be increase by the healthy ingredients defined in this class

        if(this.extraHealthyTopping1 != null){
            healthyHamburgerPrice += this.extraHealthyPrice1;
            System.out.println("Added " + this.extraHealthyTopping1 + " to my hamburger for an extra " + this.extraHealthyPrice1);
        }

        if(this.extraHealthyTopping2 != null){
            healthyHamburgerPrice += this.extraHealthyPrice2;
            System.out.println("Added " + this.extraHealthyTopping2 + " to my hamburger for an extra " + this.extraHealthyPrice2);
        }

        return healthyHamburgerPrice;
    }


}

//////////////////////////////////////////////////////////////classes///////////////////////////////////////////////////
package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        /*super keyword can also be used to access the parent class constructor.
        invoke or call parent class constructor
        Call to super() must be first statement in Derived(Student) Class constructor.
        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
        If the superclass does not have a no-argument constructor, you will get a compile-time error.
        Object does have such a constructor, so if Object is the only superclass, there is no problem.*/
        super("Deluxe", "Lamb", 11.99, "Ciabatta");
       //name, meat, price, and breadRollType are initialized above

        //need to add a soda and chips to the base Hamburger
        super.addExtraIngredients1("Chips", 1.99);
        super.addExtraIngredients2("Soda", 1.50);

    }

    //override method so you can't add any other ingredients
    @Override
    public void addExtraIngredients1(String name, double price) {
        System.out.println("You can't add any additional toppings to a Deluxe Burger");
    }

    @Override
    public void addExtraIngredients2(String name, double price) {
        System.out.println("You can't add any additional toppings to a Deluxe Burger");
    }

    @Override
    public void addExtraIngredients3(String name, double price) {
        System.out.println("You can't add any additional toppings to a Deluxe Burger");
    }

    @Override
    public void addExtraIngredients4(String name, double price) {
        System.out.println("You can't add any additional toppings to a Deluxe Burger");
    }
}
