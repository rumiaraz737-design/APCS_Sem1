/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a role: Wizard, Warrior, or Rogue");
        String role = sc.nextLine();
        
         if (role == "Wizard" || role == "wizard") {
            role = "Wizard";
            System.out.println("Your role is: " + role);
        } 
        else if (role == "Warrior" || role == "warrior") {
            role = "Warrior";
            System.out.println("Your role is: " + role);
        } 
        else if (role == "Rogue" || role == "rogue") {
            role = "Rogue";
            System.out.println("Your role is: " + role);
        } 
        else {
            System.out.println("Ok, you a " + role + "!");
        }
        System.out.print("What is your character’s name? ");
        String name = sc.nextLine();

        
        int pointsLeft = 20;
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        int charisma = 0;
        
        System.out.println("You have " + pointsLeft + " points left.");
        System.out.print("Strength (0-10): ");
        strength = sc.nextInt();
        if (strength > 10 || strength > pointsLeft) {
            System.out.println("Not allowed. Strength set to 0.");
            strength = 0;
        }
        pointsLeft = (pointsLeft-strength);
        
        System.out.println("You have " + pointsLeft + " points left.");
        System.out.print("Dexteity (0-10): ");
        dexterity = sc.nextInt();
        if (dexterity > 10 || dexterity > pointsLeft) {
            System.out.println("Not allowed. Dexterity set to 0.");
            dexterity = 0;
        }
        pointsLeft = (pointsLeft-dexterity);
        
        System.out.println("You have " + pointsLeft + " points left.");
        System.out.print("Intelligence 0-10): ");
        intelligence = sc.nextInt();
        if (intelligence > 10 || intelligence > pointsLeft) {
            System.out.println("Not allowed. Intelligence set to 0.");
            intelligence = 0;
        }
        pointsLeft = (pointsLeft-intelligence);
        
        System.out.println("You have " + pointsLeft + " points left.");
        System.out.print("Charisma (0-10): ");
        charisma = sc.nextInt();
        if (charisma > 10 || charisma > pointsLeft) {
            System.out.println("Not allowed. Charisma set to 0.");
            charisma = 0;
        }
        pointsLeft = (pointsLeft-charisma);
        
        System.out.println("Your Character");
        System.out.println(name);
        System.out.println("Role " + role);
        System.out.println("Strength " + strength);
        System.out.println("Dexterity " + dexterity);
        System.out.println("Intelligence " + intelligence);
        System.out.println("Charisma " + charisma);
        System.out.println("you have" + pointsLeft + "over");

        if (pointsLeft > 0) {
            System.out.println("You still had " + pointsLeft + " points left over!");
        }
	}
}

