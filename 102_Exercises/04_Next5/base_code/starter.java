/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double num = sc.nextDouble();
		System.out.println("Here are the next 5 numbers! :");
		System.out.print((num+1)+", ");
		System.out.print((num+2)+", ");
		System.out.print((num+3)+", ");
		System.out.print((num+4)+", ");
		System.out.println((num+5)+" ");
		System.out.println("Here are the next 5 multiples of " + num);
		System.out.print((num)+", ");
		System.out.print((num+num)+", ");
		System.out.print((num+num+num)+", ");
		System.out.print((num+num+num+num)+", ");
		System.out.println((num+num+num+num+num)+" ");
		
		System.out.println("Here is " + (num)+" divided by 100!");
		System.out.println(num/100);
		
		System.out.println("Here is " + (num)+" divided by 10!");
		System.out.println(num/10);
		
		
		
		
		

	}
}
