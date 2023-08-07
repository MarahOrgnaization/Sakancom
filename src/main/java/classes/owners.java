package classes;
import java.util.Scanner;

public class owners {
	Scanner myInput = new Scanner(System.in);
	
	
	private String name ;
	private String phoneNumber;
	public owners() {};
	
	
	public owners(String name , String phoneNumber ) {
		
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
