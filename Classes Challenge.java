//////////Class Challenge//////////////////////////////
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //create an object of type car and initialize it with the new keyword
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