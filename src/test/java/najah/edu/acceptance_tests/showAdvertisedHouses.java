package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class showAdvertisedHouses {
	@Given("The admin has showed the house information")
	public void the_admin_has_showed_the_house_information() {
	    
	}

	@Then("View all advertised homes information")
	public void view_all_advertised_homes_information() {
		 assertTrue(Main.showAdvertisedHouses());
	}

}
