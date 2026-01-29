/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    
    // Utility method to generate a random name (uses simple else-if logic via switch) [9]
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
    
    public static void main(String args[]) {
        Random rand = new Random();
        
        // --- 3a. Create 7 Dwarfs with random names/ages --- [29c]
        int numDwarfs = 7;
        // Create an array to hold all 7 Dwarf objects
        PooleDwarf[] dwarfs = new PooleDwarf[numDwarfs];
        
        // Loop 1: Creation and Initialization
        for (int i = 0; i < numDwarfs; i++) {
            // Instantiate the object using the constructor [4]
            int age = rand.nextInt(41) + 30; // Simple random age range
            dwarfs[i] = new PooleDwarf(randName(), age);
        }
        
        
        String firstDwarfName = dwarfs.getName();
        int duplicateCount = 0;
        
        
      
        for (int i = 1; i < numDwarfs; i++) {
            
            
            
          
            if (dwarfs[i].isSameName(firstDwarfName)) {
                duplicateCount++;
            
            
        }
        
        System.out.println(
            "The name of the first Dwarf was: " + firstDwarfName
        );
        System.out.println(
            firstDwarfName + " was the name with " + duplicateCount + " matches!"
        );
    }
}
}