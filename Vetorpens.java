package Entities;

public class Vetorpens {
	
	private String name, email;
	private int room;
	
	public Vetorpens(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + "," + email;
	}
	
}
