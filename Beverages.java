import java.util.Scanner;
import java.util.ArrayList;
//ERROR CHECKS FOR STRINGS AND INTEGERS NEEDED, ADD IGNORE CASE FOR ALL CHARACTER VALUES IN A STRING(INT INCLUDED)
//ADD ERROR EXCEPTIONS
public class Beverages {
	static String name;
	static ArrayList<Beverages> inStock = new ArrayList<Beverages>();
	static int whileCount = 0;
	public static void addBeverages(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Input Beverages name: ");
		String s = reader.nextLine();//Prompts user to input a string name for Beverages
		System.out.print("Input # of " + s + ": ");
		int a = reader.nextInt();//Prompts the user to input the amount of said Beverages name
		inStock.add(new Beverages());//adds the initialized Beverages object with the string name and int amount
	}
	public static void addBeverages(String s){
		Scanner reader = new Scanner(System.in);
		System.out.print("Input # of " + s + ": ");
		int a = reader.nextInt();//Prompts the user to input the amount of said Beverages name
		inStock.add(new Beverages());//adds the initialized Beverages object with the string name and int amount
	}
	public static String ToString(int index ,ArrayList<Beverages> inStock){
		return inStock.get(index).name;
	}
	public static void AIP(){//Keeps adding to to the inventory before it 
		while(whileCount == 0){
			addBeverages();
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like to keep adding Beveragess? (Y/N):");
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
			searchBeverages(stock);
			Scanner input = new Scanner(System.in);
			System.out.println("Would you like to keep searching Beveragess? (Y/N):");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				whileCount = 0;
			}else if(ans.equals("N") || ans.equals("n")){
				whileCount = 1;
			}
		}
	}*/
	public static void searchBeverages(){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the Beverages you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				System.out.println("Beverages is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			Scanner input = new Scanner(System.in);
			System.out.println("Beverages is NOT on inventory. Do you want to add to inventory? (Y/N)");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addBeverages(s);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchBeverages();
			}
		}
	}
	public static void searchBeverages(int I, Inventory stock){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the Beverages you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = stock.inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				System.out.println("Beverages is in inventory");
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
				searchBeverages();
			}
			else if(input.equals("N") || input.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchBeverages();
			}
		}else if(isTrue == false){
			Scanner input = new Scanner(System.in);
			System.out.println("Beverages is NOT on inventory. Do you want to add to inventory? (Y/N)");
			String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addBeverages(s);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchBeverages();
			}
		}
	}
	public static void main (String args[]){
		Beverages Drinks = new Beverages();
		for(int i = 1; i < 3; i++){
			addBeverages();
		}
		System.out.println("# of Beverages Types: " + Drinks.inStock.size());
		Drinks.searchBeverages();
		Drinks.AIP();
	}
}