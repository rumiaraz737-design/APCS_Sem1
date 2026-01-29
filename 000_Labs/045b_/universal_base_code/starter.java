/*
 *	Author:  
 *  Date: 
*/

import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
				2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
        System.out.println("give me a word to put in a crossword");
        String word = sc.nextLine();
        int size = word.length() + 5;
        int direction = (int)(Math.random() * 3);
        int row = (int)(Math.random() * (size - word.length()));
		int col = (int)(Math.random() * (size - word.length()));


		String[][] crossword = new String[size][size];
        
        
        for (int i = 0; i < word.length(); i++) {
            if (direction == 0) {
                crossword[row][col + i] = word.substring(i, i + 1);
            }
            else if (direction == 1) {
                crossword[row + i][col] = word.substring(i, i + 1);
            }
            else {
                crossword[row + i][col + i] = word.substring(i, i + 1);
            }
        }
            
            for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (crossword[r][c].equals(".")) {
                    int rand = (int)(Math.random() * letters.length);
                    crossword[r][c] = letters[rand];
                }
            }
        }
    for (String[] rows : crossword) {
            for (String val : rows) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}



