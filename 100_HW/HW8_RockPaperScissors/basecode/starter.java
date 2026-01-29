/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to play the computer? (yes/no/done)");
    String play = sc.nextLine();
    // 1 = rock
    // 2= paper 
    // 3= scisors
    
    while(!play.equals("done")){
        if(play.equals("yes")){
            System.out.println("Please enter rock(1)/paper(2)/scissors(3):");
            int select = sc.nextInt();
            sc.nextLine();
            int comp = (int)(Math.random() * 3) + 1;
            if(select == comp){
                    System.out.println("you tied");
                } 
                else if((select == 1 && comp == 3) || (select == 2 && comp == 1) || (select == 3 && comp == 2)){
                    System.out.println("you won");
                } 
                else {
                    System.out.println("you lost");
                }
            System.out.println("Would you like to play the computer? (yes/no/done)");
            play = sc.nextLine();
            }
        else if (play.equals("no")) {
            System.out.println("How many times would you like the computer to play itself?");
            int self = sc.nextInt();
            sc.nextLine();
            int player1=0;
            int player2=0;
            int tie=0;
            int counter=0; 
            while(counter<self){
                int select = (int)(Math.random() * 3) + 1;
                int comp = (int)(Math.random() * 3) + 1;
                if(select == comp){
                        tie++;
                    } 
                    else if((select == 1 && comp == 3) || (select == 2 && comp == 1) || (select == 3 && comp == 2)){
                        player1++;
                    } 
                    else {
                        player2++;
                    }

                    counter++;
                } 
            System.out.println("Player 1 " + player1);
            System.out.println("Player 2 " + player2);
            System.out.println("Ties " + tie);
            
            System.out.println("Would you like to play the computer? (yes/no/done)");
            play = sc.nextLine();
        } 
    }

    }
}
