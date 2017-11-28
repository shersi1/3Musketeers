import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Sides {
	static String Sides;
	static int NumOfIngr;
	static ArrayList<Ingredient> Food = new ArrayList<Ingredient>();
	//static Scanner input =  new Scanner(System.in);
	public Sides(String Name, int Amount){
		this.Sides = Name;
		this.NumOfIngr = Amount;
	}
	public Sides(){
		String Sid = JOptionPane.showInputDialog("Sides Name: ");
		//String s = input.nextLine();
		//input.nextLine();
		this.Sides = Sid;
		String a = JOptionPane.showInputDialog("# of Ingredients to make " + Sid + ": ");
		int b = Integer.parseInt(a);
		//int a = input.nextInt();
		this.NumOfIngr = b;
		for (int i = 0; i < b; i++){
		String ing = JOptionPane.showInputDialog("Insert Ingredient Name: ");
			searchIngredient(ing);
		}
		
	}
	public static void searchIngredient(String s){
		int match = 0;
		for (int j = 0; j < Inventory.inStock.size(); j++){
			if(s.matches(Inventory.inStock.get(j).name)){
				String o = JOptionPane.showInputDialog(s + " is in stock");
				Food.add(Inventory.inStock.get(j));
				match++;
			}
		}
		if(match == 0){
			String slapper = JOptionPane.showInputDialog(s + " is NOT in stock.\nDo you want to add it to inventory? Hit 'Y' for Yes, 'N' for No: ");
			//String slapper = input.next();
			if(slapper.equalsIgnoreCase("Y") || slapper.equalsIgnoreCase("Yes")){
				String freak = JOptionPane.showInputDialog("Insert amount of " + s + ": ");
				int sizer = Integer.parseInt(freak);
				Inventory.inStock.add(new Ingredient(s,sizer));
				Food.add(new Ingredient(s,sizer));
			}else if (slapper.equalsIgnoreCase("N") || slapper.equalsIgnoreCase("No")){
			}
		}
	}
	public static void SidesIngredients(){
		//Food = new ArrayList<Ingredient>(NumOf);
		for (int i = 0; i < NumOfIngr; i++){
			String g = JOptionPane.showInputDialog("Ingredient Name #" + (i + 1) + ": ");
			//String s = input.next();
			String f = JOptionPane.showInputDialog("Ingredient Amount #" + (i + 1) + ": ");
			int a = Integer.parseInt(f);
			//System.out.println();
			Food.add(new Ingredient(g,a));
		}
	}
	public static void SidesIngredients(int NumOf){
		NumOfIngr = NumOf;
		for (int i = 0; i < NumOf; i++){
			String s = JOptionPane.showInputDialog("Ingredient Name: ");
			//String s = input.next();
			String g = JOptionPane.showInputDialog("Ingredient Amount: ");
			int a = Integer.parseInt(g);
			Food.add(new Ingredient(s,a));
		}
	}
	public static int checkIngredient(){
		int index = 0;
		String ingr = JOptionPane.showInputDialog("Enter Name of Ingredient: ");
		//String ingr = input.next();
		for(int i = 0; i < NumOfIngr; i++){
			if(ingr.equals(Food.get(i).getName())){
				index = i;
			}else{
				return 0;
			}
		}
		return index;
	}
	public static String SidesToString(){
		return "Sides: " + Sides;
	}
	public static void SidesIngredientList(){
		for(int i = 0; i < NumOfIngr; i++){
			String ingr = JOptionPane.showInputDialog("Ingredient #" + (i + 1) + " : " + Food.get(i).name);
		}
	}
	public static String getName(){
		return Sides;
	}
public static void main (String args[]){
	/*Sides Burger = new Sides();
	Burger.SidesIngredients();*/
	new Sides();
	}
}
