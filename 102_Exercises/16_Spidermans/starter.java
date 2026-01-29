/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman.Tobey("Tobey Maguire", 48, "Green Goblin");
		Spiderman.Andrew("Andrew Garfield", 40, "Electro");
		Spiderman.Tom("Tom Holland", 27, "The vulture");
		Spiderman.Rumi("Rumi Araz", 15, "12oclock");
		
		System.out.print("Actor " + Rumi.getactor + "age " + Rumi.getAge + "villan "+ Rumi.getvillan);

		
	}
}
