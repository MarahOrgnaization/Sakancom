package classes;
import java.util.Scanner;

public class owners {
	Scanner myInput = new Scanner(System.in);
	
	
	private String name ;
	private String PhoneNumber;
	public owners() {};
	
	
	public owners(String name , String PhoneNumber ) {
		
		this.name=name;
		this.PhoneNumber=PhoneNumber;
	};
	public String getName() {
		return name ;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber ;
	}
	public void SetPhoneNumber(String NewPhoneNumber) {
		PhoneNumber = NewPhoneNumber;
	}
		

}
