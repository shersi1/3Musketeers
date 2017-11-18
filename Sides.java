import java.util.ArrayList;
import java.util.Scanner;
public class Sides {
	static String Sides;
	static int NumOfIngr;
	static ArrayList<Ingredient> Food = new ArrayList<Ingredient>();
	static Scanner input =  new Scanner(System.in);
	public Sides(String Name, int Amount){
		this.Sides = Name;
		this.NumOfIngr = Amount;
	}
	public Sides(){
		System.out.print("Sides Name: ");
		String s = input.next();
		this.Sides = s;
		System.out.print("# of Ingredients to make Sides: ");
		int a = input.nextInt();
		this.NumOfIngr = a;
	}
	public static void SidesIngredients(){
		//Food = new ArrayList<Ingredient>(NumOf);
		for (int i = 0; i < NumOfIngr; i++){
			System.out.print("Ingredient Name #" + (i + 1) + ": ");
			String s = input.next();
			System.out.print("Ingredient Amount #" + (i + 1) + ": ");
			int a = input.nextInt();
			System.out.println();
			Food.add(new Ingredient(s,a));
		}
	}
	public static void SidesIngredients(int NumOf){
		NumOfIngr = NumOf;
		for (int i = 0; i < NumOf; i++){
			System.out.print("Ingredient Name: ");
			String s = input.next();
			System.out.print("Ingredient Amount: ");
			int a = input.nextInt();
			Food.add(new Ingredient(s,a));
		}
	}
	public static int checkIngredient(){
		int index = 0;
		System.out.print("Enter Name of Ingredient: ");
		String ingr = input.next();
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
			System.out.println("Ingredient #" + (i + 1) + " : " + Food.get(i).name);
		}
	}
public static void main (String args[]){
	Sides Burger = new Sides();
	Burger.SidesIngredients();
	}
}
