
class Ingredients{
	String Ingredient;
	int amount;
	public Ingredients(){
		String Ingredient;
		int amount;
	}
	public Ingredients(String I, int A){
		this.Ingredient = I;
		this.amount = A;
	}
	public void getIngredient(){
		getAmount();
		System.out.println("# of " + Ingredient + " available: " + amount);
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int A){
		this.amount = A;
	}
}