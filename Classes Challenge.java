        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1.  To allow the customer to deposit funds (this should increment the balance field).
        // 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
//              //  "(087) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@email.com","12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.


//////////Class Challenge//////////////////////////////
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //create an object of type Banking and initialize it with the new keyword
        //instantiation via new operator and
        //initialization via default constructor of class Banking
        Banking james = new Banking();

        //value before you set it is Null. Default value of the class
        System.out.println("Balance before deposit is " + james.getBalance());

        //updating a private variable
        james.setBalance(1000);

        //balance
        System.out.println("Balance after deposit is " + james.getBalance());

        //make a deposit
        james.balanceIncrease(500);

        //balance
        System.out.println("Balance after deposit is " + james.getBalance());

        //make a withdrawal
        james.balanceDecrease(300);

        //balance
        System.out.println("Balance after withdrawal is " + james.getBalance());

        //make a withdrawal bigger than the balance
        james.balanceDecrease(1300);

    }
}


package com.company;

public class Banking {

    //variables
    private int accountNumber;
    private int balance;
    private String customer_name;
    private String email;
    private String phoneNumber;
    public int deposit;
    public int withdraw;

    //getters for each variable
    //getter is a method that reads value of a variable
    public int getAccountNumer(){
        return this.accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters for each variable
    // setter is a method that updates value of a variable.
    public void setAccountNumer(int accountNumber){
        //this keyword means the variable(private int accountNumber) is updated with the parameter(int accountNumber) in the method
        //during code execution, this.accountNumber is replaced by james.accountNumber, and accountNumber on the left hand side is the instance variable
        //and accountNumber on the right side is the local variable(parameter)
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    //method to increase balance
    public void balanceIncrease(int deposit){
        //this keyword means the variable(private int balance) is updated with the parameter(int deposit) in the method
        this.balance += deposit;
        System.out.println("The balance after the deposit is " + this.balance);
    }

    //method to decrease balance
    public void balanceDecrease(int withdraw){
        if (withdraw > this.balance){
            System.out.println("You can't make a withdrawal that is more than your balance");
        }
        else{
            this.balance -= withdraw;
            System.out.println("You're new balance after the withdrawal is " + this.balance);
        }
    }


}
//////////Class Challenge//////////////////////////////
