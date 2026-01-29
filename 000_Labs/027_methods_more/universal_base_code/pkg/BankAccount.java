/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Random;

public class BankAccount {
    private String Owner;
    private int AccountNumber;
    private double Balance;
    private boolean isActive;

    private static int nextAccountNumber = new Random().nextInt(951) + 50;

    private int assignAccountNumber() {
        int assignedNumber = nextAccountNumber;
        nextAccountNumber++;
        return assignedNumber;
    }

    
    public BankAccount() {
        Owner = "No name owner";
        Balance = 0.0;
        isActive = true;
        AccountNumber = assignAccountNumber();
    }

    public BankAccount(String ownerName) {
        Owner = ownerName;
        Balance = 0.0;
        isActive = true;
        AccountNumber = assignAccountNumber();
    }

    
    public BankAccount(String ownerName, double initialDeposit) {
    	Owner = ownerName;
        Balance = initialDeposit;
    	isActive = true;
        AccountNumber = assignAccountNumber();
    }

    
    public void checkBalance() {
        System.out.println("---Balance Check---");
        System.out.println(Owner + " your current balance is $" + Balance);
        
    }

    
    public void displayAccountInfo() {
        System.out.println("---Account Details---");
        System.out.println("Owner name: " + Owner);
        System.out.println("Account NumbEr: " + AccountNumber);
        System.out.println("Balance: $" + Balance);
        System.out.println("Account Status:true=active " + isActive);
    }
}
