package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class viewPicturesAndInformation {

	@Given("tenants want to see all information on available homes")
	public void tenants_want_to_see_all_information_on_available_homes() {
	   
	}

	@Then("Shows all available house information")
	public void shows_all_available_house_information() {
		assertTrue(main.viewPicturesAndInformation());
	}
	
}
