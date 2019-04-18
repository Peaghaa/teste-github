package entities;

public class Product {
	private String name;
	private int room;
	private String email;
	
	public Product (String name, int room, String email) {
		this.name = name;
		this.room = room;
		this.email = email;
	}
	

	public Product(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//public String toString() {
		//return "Rent #
	//}

	
	
}
