/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("say a phrase");
		String sent = sc.nextline();
		String ans = ""; 
		for(int i = 0; i < sent.length(); i++){
			String letter = sent.substring(i,i+1);
			if(i % 2 == 0){
				letter = letter.tLowerCase();
			}
			else{
				letter = letter.toUpperCase();
	
			}
			ans = ans + letter;
		}
		return ans;
		

	}
}

