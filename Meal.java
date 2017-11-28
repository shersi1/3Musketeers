import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Meal {
	static ArrayList<Entree> mainDish = new ArrayList<Entree>();
	static ArrayList<Sides> sideDish = new ArrayList<Sides>();
	static ArrayList<Beverages> Drinks = new ArrayList<Beverages>();
	static String name;
	static Entree main;
	static Sides side;
	static int loopCounter;
	static Scanner input =  new Scanner(System.in);
	public Meal(){
		JOptionPane.showMessageDialog(null, "List of Entrees");
		if(Menu.mainDish.isEmpty() == true){
			JOptionPane.showMessageDialog(null,"No Entrees Available.");
		}else{
			int eSize = Menu.mainDish.size();
			for(int loopCounter = 0; loopCounter < eSize; loopCounter++){
				int i = loopCounter;
				JOptionPane.showMessageDialog(null,"Entree #" + (i + 1) + ": " + Menu.mainDish.get(i).Entree);
			}
			//Scanner input = new Scanner(System.in);
			String sa = JOptionPane.showInputDialog("Select Entree #. If None, Press '0' if Not Available. Enter Command: ");
			int eMeal = Integer.parseInt(sa);
			if(eMeal > 0 && eMeal < eSize){
				Meal.main = mainDish.get(eMeal);
			}
		}
		JOptionPane.showMessageDialog(null,"List of Sides");
		if(Menu.sideDish.isEmpty() == true){
			JOptionPane.showMessageDialog(null,"No Sides Available.");
		}else{
			int sSize = Menu.sideDish.size();
			for(int i = 0; i < sSize; i++){
				JOptionPane.showMessageDialog(null,"Side #" + (i + 1) + ": " + sideDish.get(i).Sides);
			}
		}
		JOptionPane.showMessageDialog(null,"List of Drinks");
		if(Menu.Drinks.isEmpty() == true){
			JOptionPane.showMessageDialog(null,"No Drinks Available.");
		}else{
			int dSize = Menu.Drinks.size();
			for(int i = 0; i < dSize; i++){
				JOptionPane.showMessageDialog(null,"Entree #" + (i + 1) + ": " + Drinks.get(i).name);
			}
		}
	}
	public Meal(ArrayList<Entree> E, ArrayList<Sides> S, ArrayList<Beverages> B){
		this.mainDish = E;
		this.sideDish = S;
		this.Drinks = B;
		int eSize = mainDish.size();
		int sSize = sideDish.size();
		int dSize = Drinks.size();
		JOptionPane.showMessageDialog(null,"List of Entrees");
		if(eSize != 0){
			JOptionPane.showMessageDialog(null,"No Entrees Available.");
		}else{
			for(int loopCounter = 0; loopCounter < eSize; loopCounter++){
				int i = loopCounter;
				String sqa = JOptionPane.showInputDialog("Entree #" + (i + 1) + ": " + mainDish.get(i).Entree);
			}
			//Scanner input = new Scanner(System.in);
			String q = JOptionPane.showInputDialog("Select Entree #. If None, Press '0' if Not Available. Enter Command:");
			int eMeal = Integer.parseInt(q);
			if(eMeal > 0 && eMeal < eSize){
				Meal.main = mainDish.get(eMeal);
			}
		}
		JOptionPane.showMessageDialog(null,"List of Sides");
		if(sSize != 0){
			JOptionPane.showMessageDialog(null,"No Sides Available.");
		}else{
			for(int i = 0; i < sSize; i++){
				String qwq = JOptionPane.showInputDialog("Side #" + (i + 1) + ": " + sideDish.get(i).Sides);
			}
		}
		JOptionPane.showMessageDialog(null,"List of Drinks");
		if(dSize != 0){
			JOptionPane.showMessageDialog(null,"No Drinks Available.");
		}else{
			for(int i = 0; i < dSize; i++){
				String qtq = JOptionPane.showInputDialog("Entree #" + (i + 1) + ": " + Drinks.get(i).name);
			}
		}
	}
}
