import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Menu extends Meal {
	static ArrayList<Meal> Meals = new ArrayList<Meal>();
	//static ArrayList<Order> Ticket = new ArrayList<Order>();
	//Scanner input = new Scanner(System.in);
 	public static void addEntrees(){
		Meal.mainDish.add(new Entree());
	}
	public static void addSides(){
		Meal.sideDish.add(new Sides());
	}
	public static void addDrinks(){
		Meal.Drinks.add(new Beverages());
	}
	public static void searchEntrees(){
		boolean isTrue = false;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the ingredient you want to search for?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(mainDish.get(i).Entree)){
				String a = JOptionPane.showInputDialog("Ingredient is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			String ans = JOptionPane.showInputDialog("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addEntrees();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				String bodie = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchEntrees();
			}
		}
	}
	public static void searchSides(){
		boolean isTrue = false;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the ingredient you want to search for?(Case Sensitive): ");
		int size = sideDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(sideDish.get(i).Sides)){
				String bodie = JOptionPane.showInputDialog("Ingredient is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			String ans = JOptionPane.showInputDialog("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
			if(ans.equals("Y") || ans.equals("y")){
				addSides();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				String pow = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchSides();
			}
		}
	}
	public static void searchDrinks(){
		boolean isTrue = false;
		String s = JOptionPane.showInputDialog("What is the ingredient you want to search for?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(Drinks.get(i).name)){
				String bodie = JOptionPane.showInputDialog("Ingredient is in inventory");
				isTrue = true;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			String ans = JOptionPane.showInputDialog("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
			//String ans = input.nextLine();
			if(ans.equals("Y") || ans.equals("y")){
				//SIP(stock);
				addDrinks();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				String bollywood = JOptionPane.showInputDialog("You entered the wrong command, try again!");
				searchDrinks();
			}
		}
	}
	public static void printEntrees(){
		String bodie = JOptionPane.showInputDialog("List of Entrees on file");
		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			JOptionPane.showMessageDialog(null,"Entree #" + i + 1 + ": " + mainDish.get(i).Entree);
		}
	}
	public static void printSides(){
		String spodie = JOptionPane.showInputDialog("List of Sides on file");
		int size = sideDish.size();
		for (int i = 0; i < size; i++){
			JOptionPane.showMessageDialog(null,"Side #" + i + 1 + ": " + sideDish.get(i).Sides);
		}
	}
	public static void printDrinks(){
		String bodie = JOptionPane.showInputDialog("List of Drinks on file");
		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			JOptionPane.showMessageDialog(null,"Drink #" + i + 1 + ": " + Drinks.get(i).name);
		}
	}
	public static void removeEntrees(){
		boolean isTrue = true;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the Entree you want to remove?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(mainDish.get(i).Entree)){
				String ans = JOptionPane.showInputDialog("Entree is in inventory. Are you sure you want " + s + " removed (Y/N): ");
				if(ans.equals("Y") || ans.equals("y")){
					//SIP(stock);
					mainDish.remove(i);;
				}
				else if(ans.equals("N") || ans.equals("n")){
					break;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			JOptionPane.showMessageDialog(null,"Entree is NOT on inventory.");
			//String ans = input.nextLine();
			}
		}
	}
	public static void removeSides(){
		boolean isTrue = true;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the Side you want to remove?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = sideDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(sideDish.get(i).Sides)){
				String ans = JOptionPane.showInputDialog("Side is in inventory. Are you sure you want " + s + " removed (Y/N): ");
				if(ans.equals("Y") || ans.equals("y")){
					//SIP(stock);
					sideDish.remove(i);;
				}
				else if(ans.equals("N") || ans.equals("n")){
					break;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			JOptionPane.showMessageDialog(null,"Beverages is NOT on inventory.");
			//String ans = input.nextLine();
			}
		}
	}
	public static void removeDrinks(){
		boolean isTrue = true;
		//Scanner search = new Scanner(System.in);
		String s = JOptionPane.showInputDialog("What is the Beverages you want to remove?(Case Sensitive): ");
		//String s = search.nextLine();

		int size = Drinks.size();
		for (int i = 0; i < size; i++){
			if(s.equals(Drinks.get(i).name)){
				String ans = JOptionPane.showInputDialog("Beverages is in inventory. Are you sure you want " + s + " removed (Y/N): ");
				if(ans.equals("Y") || ans.equals("y")){
					//SIP(stock);
					Drinks.remove(i);;
				}
				else if(ans.equals("N") || ans.equals("n")){
					break;
			}else{
			}
		}
		if(isTrue == false){
			//Scanner input = new Scanner(System.in);
			JOptionPane.showMessageDialog(null,"Beverages is NOT on inventory.");
			//String ans = input.nextLine();
			}
		}
	}
	public void runMenu(){
		//Scanner input = new Scanner(System.in);
		String bodie = JOptionPane.showInputDialog("Enter the number to match what you want\n1. Entrees\n2. Sides\n3. Beverages");
		int mainMenu = Integer.parseInt(bodie);
		if(mainMenu == 1){
			String lodie = JOptionPane.showInputDialog("1. Add Entrees\n2. Search Entrees\n3. Print Entrees\n4. Remove Entrees");
			int entreeMenu = Integer.parseInt(lodie);
			if(entreeMenu == 1){
				addEntrees();
			}else if(entreeMenu == 2){
				searchEntrees();
			}else if(entreeMenu == 3){
				printEntrees();
			}else if(entreeMenu == 4){
				removeEntrees();
			}else{
				String dodie = JOptionPane.showInputDialog("Error. Try Again.");
				runMenu();
			}
		}else if(mainMenu == 2){
			String codie = JOptionPane.showInputDialog("1. Add Sides\n2. Search Sides\n3. Print Sides\n4.Remove Sides");
			int sideMenu = Integer.parseInt(codie);
			if(sideMenu == 1){
				addSides();
			}else if(sideMenu == 2){
				searchSides();
			}else if(sideMenu == 3){
				printSides();
			}else if(sideMenu == 4){
				removeSides();
			}else{
				String wodie = JOptionPane.showInputDialog("Error. Try Again.");
				runMenu();
			}
		}else if(mainMenu == 3){
			String godie = JOptionPane.showInputDialog("1. Add Drinks\n2. Search Drinks\n3. Print Drinks\n4. Remove Drinks");
			int drinkMenu = Integer.parseInt(godie);
			if(drinkMenu == 1){
				addDrinks();
			}else if(drinkMenu == 2){
				searchDrinks();
			}else if(drinkMenu == 3){
				printDrinks();
			}else if(drinkMenu == 4){
				removeDrinks();
			}else{
				String vodie = JOptionPane.showInputDialog("Error. Try Again.");
				runMenu();
			}
		}else{
			String nodie = JOptionPane.showInputDialog("Error. Enter '0' to Try Again OR Enter '9' to Exit Menu");
			int exit = Integer.parseInt(nodie);
			while(exit == 0 || exit == 9){
				if(exit == 0){
					runMenu();
				}else if(exit == 9){
					break;
				}
			}
		}
	}
	public void MenuList(){
		String jodie = JOptionPane.showInputDialog("How many entrees do you want to create?: ");
		int EntreeAmount = Integer.parseInt(jodie);
		for (int k = 0; k < EntreeAmount; k++){
			addEntrees();
		}
		//System.out.println();
		String podie = JOptionPane.showInputDialog("How many sides do you want to create?: ");
		int SideAmount = Integer.parseInt(podie);
		for (int o = 0; o < SideAmount; o++){
			addSides();
		}
		//System.out.println();
		String rodie = JOptionPane.showInputDialog("How many drinks do you want to create?: ");
		int DrinkAmount = Integer.parseInt(rodie);
		for (int w = 0; w < DrinkAmount; w++){
			addDrinks();
		}
	}
	public static void main(String args[]){
		Menu M = new Menu();
		
	}
}

