/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int num1 = sc.nextInt();
        System.out.println("What month were you born?(1-12)");
        int num2 = sc.nextInt();
        System.out.println("What day were you born?(1-31)");
        int num3 = sc.nextInt();
        System.out.println("What year were you born?");
        int num4 = sc.nextInt();
        System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
        double num5 = sc.nextDouble();
        
        System.out.println("Your name is " + name + " and you were born on " + num2 + "/" + num3 + "/" + num4 );
        System.out.println("You are " + num1 + " years old!!!");
        System.out.println("You have " + num5  + " in your wallet.");


	
	}
}
