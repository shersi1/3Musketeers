
public class Rooms {
	String RoomName;
	int Beds;
	double roomSize;
	double Price;
	public Rooms(){
		}
	public String getName(){
		return "Room Name: " + RoomName;
	}
	public void setName(String R){
		this.RoomName = R;
	}
	public String getSize(){
		return "Room Size: " + roomSize + " sq/ft";
	}
	public void setSize(double R){
		this.roomSize = R;
	}
	public String getPrice(){
		return "Price per night: $" + Price;
	}
	public void setPrice(double P){
		this.Price = P;
	}
	public Rooms(String roomName, int beds, double RoomSize, double price){
		this.RoomName = roomName;
		this.Beds = beds;
		this.roomSize = RoomSize;
		this.Price = price;
	}
}
