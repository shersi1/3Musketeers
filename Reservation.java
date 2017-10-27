import java.util.*;
public class Reservation {
	String FirstName;
	String LastName;
	String phoneNum;
	List<Tables> Table;
	public Reservation(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a first name: ");
		String FirstName = input.nextLine();
		System.out.print("Enter a last name: ");
		String LastName = input.nextLine();
		System.out.print("Enter phone number (7-Digits ONLY): ");
		String phoneNum = input.nextLine();
		System.out.print("Enter desired seats: ");
		int Seats = input.nextInt();
		/*for(int i = 0; i < length ; i++){
				{
				
			}
		}*/
		}
public void ReturnInfo(){
	/*this.FirstName = R.FirstName;
	this.LastName = R.LastName;
	this.phoneNum = R.phoneNum;*/
	System.out.println(LastName + ", " + FirstName);
	System.out.println(phoneNum);
}
public int getTable(){
	return ((Tables) Table).getId();
}
public String getName(){
	return LastName + ", " + FirstName;
}
public String setName(){
	Scanner input = new Scanner(System.in);
	System.out.print("Input Last Name: ");
	this.LastName = input.nextLine();
	System.out.print("Input First Name: ");
	this.FirstName = input.nextLine();
	return LastName + ", " + FirstName;
}
public String getNum(){
	return phoneNum;
}

}