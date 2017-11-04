import java.util.HashMap;
import java.util.Scanner;

 class Ingredient {

Scanner scan = new Scanner(System.in);


public HashMap<String, Integer> Ingredients = new HashMap<String, Integer>();

private String IngredientName;
private int Quantity;

public void addIngredient(){
    Ingredients.put(scan.nextLine(), scan.nextInt());
}

Ingredient(String IngredientName, int Quantity){
    this.IngredientName = IngredientName;
    this.Quantity = Quantity;
   }
}