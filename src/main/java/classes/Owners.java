package classes;
import java.util.Scanner;

public class Owners {
	Scanner myInput = new Scanner(System.in);
	
	
	private String name ;
	private String phoneNumber;
	public Owners() {};
	
	
	public Owners(String name , String phoneNumber ) {
		
		this.name=name;
		this.phoneNumber=phoneNumber;
	};
	public String getName() {
		return name ;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber ;
	}
	public void SetPhoneNumber(String NewPhoneNumber) {
		phoneNumber = NewPhoneNumber;
	}
		

}
