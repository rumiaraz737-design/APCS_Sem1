/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a chocie: animal, object, or face ");
        String ch = sc.nextLine();
        
        if (ch.equals("animal")) {  
        	System.out.println("     *  *");
        	System.out.println("(             )");
        	System.out.println("");
        	System.out.println("      ----");
        }
         if (ch.equals("object")) {  
        	System.out.println(";,//;,    ,;/");
        	System.out.println("o:::::::;;///");
        	System.out.println(">:::::::::////");
        	System.out.println("''\\\\\'" );
       
        							
        	
        }
         if (ch.equals("face")) {  
        	System.out.println("\\   /");
        	System.out.println("*  *  ");
        	System.out.println("----");
        	
        	
        }
        }
	}

