
class Ingredient{
	String name;
	int amount;
	boolean isEmpty;
	public Ingredient(){
		String name;
		int amount;
		boolean isEmpty;
	}
	public Ingredient(String n, int A){
		this.name = n;
		this.amount = A;
	}
	public String getName(){
		return name;
	}
	public void getIngredient(){
		getAmount();
		System.out.println("# of " + name + " available: " + amount);
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int A){
		this.amount = A;
	}
	public String toString(){
		return "Ingredient Name: " + this.name;
	}
}