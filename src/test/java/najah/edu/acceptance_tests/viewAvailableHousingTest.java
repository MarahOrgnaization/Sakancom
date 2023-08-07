package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.House;
import classes.Residence;
import classes.apartments;
import classes.main;
import classes.owners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewAvailableHousingTest {
	
	@Given("tenants wants to see available homes")
	public void tenants_wants_to_see_available_homes() {
	   
	}

	@When("tenants enters the number {int}")
	public void tenants_enters_the_number(Integer int1) {
	    
	}

	@Then("view all the available housing")
	public void view_all_the_available_housing() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner1 = new owners("mayar","0569902837");
		 House House1=new House(1,Residence1,apartments1,owner1,true);
		 main.acceptAndReject("y",House1);
		assertTrue(main.viewAvailableHousing());
	  
	}



}
