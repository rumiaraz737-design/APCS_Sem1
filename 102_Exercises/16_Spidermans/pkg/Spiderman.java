package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;
	
public Spiderman() {		// Default Constructor
		actor = new String("Michael");
		villain = new String("Scott");
		age = 67;
	}

	
public Spiderman(String a){
	actor = a;
	age = 0;
	villain = "No villan known";
}
public Spiderman(String a, int o){
	actor = a;
	age = o;
	villain = "no villan known";
}
public Spiderman(String a, int o, String v){
	actor = a;
	age = o;
	villain = v;
}

public int getage(){						// Returns the ID of the Employee
		return this.age;
	}
	
public String getactor(){			// Returns First Name of the Employee
		return this.actor;
	}
	
public String getvillan(){
		return this.villain; 
}

public void getage(int age){
	this.age = age;
}

public void getage(String actor){
	this.actor= actor;
}

public void getvillan(String villain){
	this.villain = villain;
}




	
	
	
	// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
