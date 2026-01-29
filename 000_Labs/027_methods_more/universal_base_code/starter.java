/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Welcome to the at would you like to");
        System.out.println("1. create a new account with no info: 1");
        System.out.println("2.create a new account with a name: 2");
        System.out.println("3.create a new account with a name and deposit: 3");
        int num = sc.nextInt();
        sc.nextLine();
        if(num == 1){
        	BankAccount account1 = new BankAccount();
    		account1.displayAccountInfo();
    		System.out.println("would you like to check ur balance yes/no");
    		String check = sc.nextLine();
    		if(check.equals("yes")){
    			account1.checkBalance(); 
    		}
    		
        }


      
      if(num == 2){ 
      	System.out.println("what is ur name");
      	String name = sc.nextLine();
      	sc.nextLine();
    	BankAccount account2 = new BankAccount(name);
    	account2.displayAccountInfo(); 
    	System.out.println("would you like to check ur balance yes/no");
    		String check = sc.nextLine();
    		if(check.equals("yes")){
    			account2.checkBalance(); 
    		}
    		
        }
       if(num == 3){
       	System.out.println("what is ur name");
      	String name = sc.nextLine();
      	System.out.println("How much is the deposit");
      	int dep = sc.nextInt();
      	sc.nextLine();
    	BankAccount account3 = new BankAccount(name, dep);
    	account3.displayAccountInfo(); 
    	System.out.println("would you like to check ur balance yes/no");
    		String check = sc.nextLine();
    		if(check.equals("yes")){
    			account3.checkBalance(); 
    		}
    }
}
}

		
	

