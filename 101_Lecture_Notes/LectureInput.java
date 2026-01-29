/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        double item1Price = 5.99;
        double item2Price = 15.99;
        double item3Price = 7.99;
        
        System.out.println(" Welcome to wing, pizza, burger joint");
        System.out.println("here is our menu");
        System.out.println("1. 🐔 CHICKEN WINGS - $5.99" + item1Price);
        System.out.println("2. 🍕 Pizza - $" + item2Price);
        System.out.println("3. 🍔 Burger - $" + item3Price);
        System.out.println();
        
        System.out.println("what is the name for your order");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How Many servings of chicken wings would you like");
        int chik = sc.nextInt();
        System.out.println("how many Pizzas would you like");
        int pizza = sc.nextInt();
        System.out.println("how many burgers would you like");
        int burger = sc.nextInt();
        
        double total1 = item1Price * chik;
        double total2 = item2Price * pizza;
        double total3 = item3Price * burger;
        
        double current = total1 + total2 + total3;
        System.out.println("your current total is " + current);
        
        System.out.println("what percent would you like to tip");
        double tipPercent = sc.nextDouble();
        double tip = current * (tipPercent/100);
        double grandTotal = current + tip;

        System.out.println( name + "'s recipt");
        System.out.println(chik + " x Wings");
        System.out.println(pizza + " x pizzas");
        System.out.println(burger + " x burgers");
        System.out.println("Tip (" + tipPercent + ") = " + tip );
        System.out.println("---------------------");
        System.out.println("grand total = " + grandTotal);
        System.out.println("---------------------");
        System.out.println("Thanks for eating at wing, pizza, burger.");
        
        

	}
}
