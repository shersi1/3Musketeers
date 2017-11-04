import java.util.Scanner;
import java.util.ArrayList;
public class Inventory {
	static ArrayList<Ingredients> inStock = new ArrayList<Ingredients>();
	public static void addIngredient(Inventory stock){
		Scanner reader = new Scanner(System.in);
		System.out.print("Input ingredient name: ");
		String s = reader.nextLine();
		System.out.print("Input # of " + s + ": ");
		int a = reader.nextInt();
		inStock.add(new Ingredients(s,a));
	}
	public static void searchIngredient(String s, Inventory stock){
		int size = inStock.size();
		for (int i = 0; i < size; i++){
			if(s.equals(stock)){
				System.out.println("Ingredient is on inventory");
			}else{
				Scanner input = new Scanner(System.in);
				System.out.println("Ingredient is NOT on inventory. Do you want to add to inventory? (Y/N)");
				String ans = input.nextLine();
				if(ans.equals("Y") || ans.equals("y")){
					addIngredient(stock);
					break;
				}else if(ans.equals("N") || ans.equals("n")){
					break;
				}else{
					System.out.println("You entered the wrong command, try again!");
					searchIngredient(s, stock);
				}
			}
		}
	}
	public static void main (String args[]){
		Inventory Stock = new Inventory();
		for(int i = 1; i < 3; i++){
			addIngredient(Stock);
		}
		System.out.println("# of Ingredient Types: " + Stock.inStock.size());
		searchIngredient("Salt",Stock);
	}
}