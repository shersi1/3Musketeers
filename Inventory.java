import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//ERROR CHECKS FOR STRINGS AND INTEGERS NEEDED, ADD IGNORE CASE FOR ALL CHARACTER VALUES IN A STRING(INT INCLUDED)
//ADD ERROR EXCEPTIONS
public class Inventory {
	static ArrayList<Ingredient> inStock = new ArrayList<Ingredient>();
	static int whileCount = 0;
	public static void addIngredient(){
		//Scanner reader = new Scanner(System.in);
		//System.out.print("Input ingredient name: ");
		String s = JOptionPane.showInputDialog("Enter Ingredient Name: ");
		//String s = reader.nextLine();//Prompts user to input a string name for ingredient
		String y = JOptionPane.showInputDialog("Input # of " + s + ": ");
		int sy = Integer.parseInt(y);
		//int a = reader.nextInt();//Prompts the user to input the amount of said ingredient name
		inStock.add(new Ingredient(s,sy));//adds the initialized Ingredient object with the string name and int amount
	}
	public static void addIngredient(String s){
		//Scanner reader = new Scanner(System.in);
		String y = JOptionPane.showInputDialog("Input # of " + s + ": ");
		int sy = Integer.parseInt(y);
		//System.out.print("Input # of " + s + ": ");
		//int a = reader.nextInt();//Prompts the user to input the amount of said ingredient name
		inStock.add(new Ingredient(s,sy));//adds the initialized Ingredient object with the string name and int amount
	}
	public static String ToString(int index ,ArrayList<Ingredient> inStock){
		return inStock.get(index).name;
	}
	public static void AIP(){//Keeps adding to to the Inventory before it 
		whileCount = 0;
		while(whileCount == 0){
			addIngredient();
			//Scanner input = new Scanner(System.in);
			//System.out.println("Would you like to keep adding ingredients? (Y/N):");
			String bean = JOptionPane.showInputDialog("Would you like to keep adding Ingredients? (Y/N): ");
			//String ans = input.nextLine();
			if(bean.equals("Y") || bean.equals("y")){
				whileCount = 0;
			}else if(bean.equals("N") || bean.equals("n")){
				whileCount = 1;
			}
		}
	}
	/*public static void SIP(Inventory stock){//Keeps adding to to the Inventory before it 
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
	public static void searchIngredient(){
		boolean isTrue = false;
		//Scanner search = new Scanner(System.in);
		//System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		//String s = search.nextLine();
		String s = JOptionPane.showInputDialog("What is the ingrediebt you want to search? (Case Sensistive): ");
		int size = inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(inStock.get(i).name)){
				//System.out.println("Ingredient is in Inventory");
				String dio = JOptionPane.showInputDialog("Ingredient is in Inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			//System.out.println("Ingredient is NOT on Inventory. Do you want to add to Inventory? (Y/N)");
			String iasdasd = JOptionPane.showInputDialog("Ingredient is NOT in Inventory. Do you want to add to Inventory? (Y/N)");
			//String ans = input.nextLine();
			if(iasdasd.equals("Y") || iasdasd.equals("y")){
				//SIP(stock);
				addIngredient(s);
			}
			else if(iasdasd.equals("N") || iasdasd.equals("n")){
			}else{
				String bolbol = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchIngredient();
			}
		}
	}
	public static void searchIngredient(String ing, ArrayList<Ingredient> I){
		boolean isTrue = false;
		//Scanner search = new Scanner(System.in);
		int size = inStock.size();
		for (int i = 0; i < size; i++){
			if(ing.equals(inStock.get(i).name)){
				String HSDO = JOptionPane.showInputDialog("Ingredient is in Inventory");
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
				searchIngredient();
			}
			else if(reply.equals("N") || reply.equals("n")){
			}else{
				String kaka = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchIngredient();
			}
		}else if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			String ans = JOptionPane.showInputDialog("Ingredient is NOT on Inventory. Do you want to add to Inventory? (Y/N)");
			//String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addIngredient(ing);
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				String wowow = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchIngredient();
			}
		}
	}
	public static void main (String args[]){
	}
}