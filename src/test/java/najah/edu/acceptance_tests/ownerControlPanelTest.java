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

public class ownerControlPanelTest {
	@Given("Owner control panel")
	public void owner_control_panel() {
	  
	}

	@When("Owner enter the number {int}")
	public void owner_enter_the_number(Integer int1) {
	   
	}

	@Then("Shows him the number of rooms, bathrooms, balcony, tenants and their information")
	public void shows_him_the_number_of_rooms_bathrooms_balcony_tenants_and_their_information() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner1 = new owners("mayar","0569902837");
		 House House1=new House(1,Residence1,apartments1,owner1,true);
		 main.acceptAndReject("y",House1);
		 main.bookacc(1,"mayar");
		assertTrue(main.controlPanel("mayar"));
	}

}
