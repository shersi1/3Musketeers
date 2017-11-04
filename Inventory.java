import java.util.Scanner;
import java.util.ArrayList;
public class Inventory {
	static ArrayList<Ingredients> inStock = new ArrayList<Ingredients>();
	public static void addIngredient(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input ingredient name: ");
		String s = input.nextLine();
		System.out.print("Input # of " + s + ": ");
		int a = input.nextInt();
		inStock.add(new Ingredients(s,a));	
	}
	public static void main (String args[]){
		addIngredient();
	}
}