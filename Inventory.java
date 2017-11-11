import java.util.Scanner;
import java.util.ArrayList;
//ERROR CHECKS FOR STRINGS AND INTEGERS NEEDED, ADD IGNORE CASE FOR ALL CHARACTER VALUES IN A STRING(INT INCLUDED)
//ADD ERROR EXCEPTIONS
public class Inventory {
	static ArrayList<Ingredient> inStock = new ArrayList<Ingredient>();
	static int whileCount = 0;
	public static void addIngredient(Inventory stock){
		Scanner reader = new Scanner(System.in);
		System.out.print("Input ingredient name: ");
		String s = reader.nextLine();//Prompts user to input a string name for ingredient
		System.out.print("Input # of " + s + ": ");
		int a = reader.nextInt();//Prompts the user to input the amount of said ingredient name
		inStock.add(new Ingredient(s,a));//adds the initialized Ingredient object with the string name and int amount
	}
	public static void addIngredient(String s,Inventory stock){
		Scanner reader = new Scanner(System.in);
		System.out.print("Input # of " + s + ": ");
		int a = reader.nextInt();//Prompts the user to input the amount of said ingredient name
		inStock.add(new Ingredient(s,a));//adds the initialized Ingredient object with the string name and int amount
	}
	public static String ToString(int index ,ArrayList<Ingredient> inStock){
		return inStock.get(index).name;
	}
	public static void AIP(Inventory stock){//Keeps adding to to the inventory before it 
		while(whileCount == 0){
			addIngredient(stock);
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like to keep adding ingredients? (Y/N):");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				whileCount = 0;
			}else if(ans.equals("N") || ans.equals("n")){
				whileCount = 1;
			}
		}
	}
	/*public static void SIP(Inventory stock){//Keeps adding to to the inventory before it 
		while(whileCount == 0){
			searchIngredient(stock);
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like to keep searching ingredients? (Y/N):");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				whileCount = 0;
			}else if(ans.equals("N") || ans.equals("n")){
				whileCount = 1;
			}
		}
	}*/
	public static void searchIngredient(Inventory stock){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = stock.inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				System.out.println("Ingredient is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			Scanner input = new Scanner(System.in);
			System.out.println("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addIngredient(s,stock);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchIngredient(stock);
			}
		}
	}
	public static void searchIngredient(int I, Inventory stock){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = stock.inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				System.out.println("Ingredient is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == true){
			Scanner input = new Scanner(System.in);
			System.out.print("Do You Want To Keep Searching? (Y/N)");
			String reply = input.nextLine();
			if(input.equals("Y") || input.equals("y")){
				//SIP(stock);
				searchIngredient(stock);
			}
			else if(input.equals("N") || input.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchIngredient(stock);
			}
		}else if(isTrue == false){
			Scanner input = new Scanner(System.in);
			System.out.println("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addIngredient(s,stock);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchIngredient(stock);
			}
		}
	}
	public static void main (String args[]){
		Inventory Stock = new Inventory();
		for(int i = 1; i < 3; i++){
			addIngredient(Stock);
		}
		System.out.println("# of Ingredient Types: " + Stock.inStock.size());
		searchIngredient(Stock);
		AIP(Stock);
	}
}