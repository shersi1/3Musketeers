import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
	static ArrayList<Entree> mainDish = new ArrayList<Entree>();
	static ArrayList<Sides> sideDish = new ArrayList<Sides>();
	static ArrayList<Beverages> Drinks = new ArrayList<Beverages>();
	public static void addEntrees(){
		mainDish.add(new Entree());
	}
	public static void addSides(){
		sideDish.add(new Sides());
	}
	public static void addDrinks(){
		Drinks.add(new Beverages());
	}
	public static void searchEntrees(){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(mainDish.get(i).Entree)){
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
				addEntrees();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchEntrees();
			}
		}
	}
	public static void searchSides(){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = sideDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(sideDish.get(i).Sides)){
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
				addSides();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchSides();
			}
		}
	}
	public static void searchDrinks(){
		boolean isTrue = false;
		Scanner search = new Scanner(System.in);
		System.out.print("What is the ingredient you want to search for?(Case Sensitive): ");
		String s = search.nextLine();

		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			if(s.equals(Drinks.get(i).name)){
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
				addDrinks();
			}
			else if(ans.equals("N") || ans.equals("n")){
			}else{
				System.out.println("You entered the wrong command, try again!");
				searchDrinks();
			}
		}
	}
	public static void printEntrees(){
		System.out.println("List of Entrees on file");
		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			System.out.println("Entree #" + i + 1 + ": " + mainDish.get(i).Entree);
		}
	}
	public static void printSides(){
		System.out.println("List of Sides on file");
		int size = sideDish.size();
		for (int i = 0; i < size; i++){
			System.out.println("Side #" + i + 1 + ": " + sideDish.get(i).Sides);
		}
	}
	public static void printDrinks(){
		System.out.println("List of Drinks on file");
		int size = mainDish.size();
		for (int i = 0; i < size; i++){
			System.out.println("Drink #" + i + 1 + ": " + Drinks.get(i).name);
		}
	}
	public void runMenu(){
		Scanner input = new Scanner(System.in);
		System.out.println("1. Entrees/n 2. Sides/n 3. Beverages");
		int mainMenu = input.nextInt();
		if(mainMenu == 1){
			System.out.println("1. Add Entrees/n 2. Search Entrees/n 3. Print Entrees");
			int entreeMenu = input.nextInt();
			if(entreeMenu == 1){
				addEntrees();
			}else if(entreeMenu == 2){
				searchEntrees();
			}else if(entreeMenu == 3){
				printEntrees();
			}else{
				System.out.println("Error. Try Again.");
				runMenu();
			}
		}else if(mainMenu == 2){
			System.out.println("1. Add Sides/n 2. Search Sides/n 3. Print Sides");
			int sideMenu = input.nextInt();
			if(sideMenu == 1){
				addSides();
			}else if(sideMenu == 2){
				searchSides();
			}else if(sideMenu == 3){
				printSides();
			}else{
				System.out.println("Error. Try Again.");
				runMenu();
			}
		}else if(mainMenu == 3){
			System.out.println("1. Add Drinks/n 2. Search Drinks/n 3. Print Drinks");
			int drinkMenu = input.nextInt();
			if(drinkMenu == 1){
				addDrinks();
			}else if(drinkMenu == 2){
				searchDrinks();
			}else if(drinkMenu == 3){
				printDrinks();
			}else{
				System.out.println("Error. Try Again.");
				runMenu();
			}
		}else{
			System.out.println("Error. Enter '0' to Try Again OR Enter '9' to Exit Menu");
			int exit = input.nextInt();
			while(exit == 0 || exit == 9){
				if(exit == 0){
					runMenu();
				}else if(exit == 9){
					break;
				}
			}
		}
	}
}

