import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//ERROR CHECKS FOR STRINGS AND INTEGERS NEEDED, ADD IGNORE CASE FOR ALL CHARACTER VALUES IN A STRING(INT INCLUDED)
//ADD ERROR EXCEPTIONS
public class Beverages {
	static String name;
	static int NumOfIngr;
	static ArrayList<Ingredient> drinks = new ArrayList<Ingredient>();
	static ArrayList<Beverages> inStock = new ArrayList<Beverages>();
	//static Scanner input = new Scanner(System.in);
	static int whileCount = 0;
	public Beverages(String N, int E){
		this.name = N;
		this.NumOfIngr = E;
	}
	public Beverages(){
		String s = JOptionPane.showInputDialog("Beverages Name: ");
		//String s = input.next();
		this.name = s;
		String d = JOptionPane.showInputDialog("# of Ingredients to make " + name + ": ");
		int a = Integer.parseInt(d);
		this.NumOfIngr = a;
		for (int i = 0; i < a; i++){
			String ing= JOptionPane.showInputDialog("Insert Ingredient Name: ");
			//String ing = input.next();
			searchIngredient(ing);
		}
	}
	public static void searchIngredient(String s){
		int match = 0;
		for (int j = 0; j < Inventory.inStock.size(); j++){
			if(s.matches(Inventory.inStock.get(j).name)){
				String a = JOptionPane.showInputDialog(s + " is in stock");
				drinks.add(Inventory.inStock.get(j));
				match++;
			}
		}
		if(match == 0){
			String slapper = JOptionPane.showInputDialog(s + " is NOT in stock.\nDo you want to add it to inventory? Hit 'Y' for Yes, 'N' for No: ");
			//String slapper = input.next();
			if(slapper.equalsIgnoreCase("Y") || slapper.equalsIgnoreCase("Yes")){
				String a = JOptionPane.showInputDialog("Insert amount of " + s + ": ");
				int sizer = Integer.parseInt(a);
				Inventory.inStock.add(new Ingredient(s,sizer));
				drinks.add(new Ingredient(s,sizer));
			}else if (slapper.equalsIgnoreCase("N") || slapper.equalsIgnoreCase("No")){
			}
		}
	}
	public static void addBeverages(){
		//Scanner reader = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("Input Beverages name: ");
		//String s = reader.nextLine();//Prompts user to input a string name for Beverages
		String d = JOptionPane.showInputDialog("Input # of " + s + ": ");
		int a = Integer.parseInt(d);//Prompts the user to input the amount of said Beverages name
		inStock.add(new Beverages());//adds the initialized Beverages object with the string name and int amount
	}
	public static void addBeverages(String s){
	//Scanner reader = new Scanner(System.in);
		String c = JOptionPane.showInputDialog("Input # of " + s + ": ");
		int b = Integer.parseInt(c);//Prompts the user to input the amount of said Beverages name
		inStock.add(new Beverages());//adds the initialized Beverages object with the string name and int amount
	}
	public static String ToString(int index ,ArrayList<Beverages> inStock){
		return inStock.get(index).name;
	}
	public static void AIP(){//Keeps adding to to the inventory before it 
		while(whileCount == 0){
			addBeverages();
			//Scanner input = new Scanner(System.in);
			String ans = JOptionPane.showInputDialog("Would you like to keep adding Beveragess? (Y/N):");
			//String ans = input.nextLine();
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
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the Beverages you want to search for?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				JOptionPane.showMessageDialog(null,"Beverages is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			String ans = JOptionPane.showInputDialog("Beverages is NOT on inventory. Do you want to add to inventory? (Y/N)");
			//String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addBeverages(s);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				String a = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchBeverages();
			}
		}
	}
	public static void searchBeverages(int I, Inventory stock){
		boolean isTrue = false;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the Beverages you want to search for?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = stock.inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				JOptionPane.showMessageDialog(null,"Beverages is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == true){
			//Scanner input = new Scanner(System.in);
			String reply = JOptionPane.showInputDialog("Do You Want To Keep Searching? (Y/N)");
			//String reply = input.nextLine();
			if(reply.equals("Y") || reply.equals("y")){
				//SIP(stock);
				searchBeverages();
			}
			else if(reply.equals("N") || reply.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchBeverages();
			}
		}else if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			String ans = JOptionPane.showInputDialog("Beverages is NOT on inventory. Do you want to add to inventory? (Y/N)");
			//String ans = input.nextLine();
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
}