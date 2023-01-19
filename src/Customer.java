import javax.swing.*;
import java.util.AbstractList;

public class Customer {
    private double balance;
    private String firstName;
    private String lastName;
    private String password;





    public Customer (String fName, String lName, double bal){
        this.firstName = fName;
        this.lastName = lName;
        this.balance = bal;
        password = fName + lName;

    }


    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPassword(){
        return password;
    }

    public double takeMoney (double moneyTaken){
        balance -= moneyTaken;
        return balance;
    }
    public double giveMoney (double moneyToGive){
        balance += moneyToGive;
        return balance;
    }

    @Override
    public String toString() {
        return "Customer: " + "balance: " + balance + ", firstName: " + firstName + ", lastName: " + lastName;
    }
}
