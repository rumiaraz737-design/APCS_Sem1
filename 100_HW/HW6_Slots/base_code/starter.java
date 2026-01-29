/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int money = 100;
	 System.out.println("Welcome to the slot machine!");
     System.out.println("You start with $" + money);
     System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
     String play = sc.nextLine();
    while (play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")) {
            if (money <= 0) {
                System.out.println("You've run out of money Thanks for coming Come back soo!");
                break;
            }
            System.out.print("How much would you like to bet? $");
            int bet = sc.nextInt();
            sc.nextLine();
             if (bet > 0 && bet <= money) {
                int slot1 = (int)(Math.random() * 10);
                int slot2 = (int)(Math.random() * 10);
                int slot3 = (int)(Math.random() * 10);
                System.out.println("You got: " + slot1 + " " + slot2 + " " + slot3);

                if (slot1 == slot2 && slot2 == slot3) {
                    int win = bet * 3;
                    money = money+win;
                    System.out.println("All three match! You win $" + win);
                } else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
                    int win = bet * 2;
                    money = money+win;
                    System.out.println("Two numbers match! You win $" + win);
                } else {
                    money -= bet;
                    System.out.println("No match. You lose $" + bet);
                }
            } else {
                System.out.println("Invild bet ou must bet more than $0 and not more than your current money");
            }

            System.out.println("Current money: $" + money);

            if (money <= 0) {
                System.out.println("You've run out of money! Game over!");
                break;
            }

            System.out.print("Would you like to play again? (Yes/yes/Y/y): ");
            play = sc.nextLine();
        }

        System.out.println("Thanks for playing! You leave with $" + money);
        
	}
}

