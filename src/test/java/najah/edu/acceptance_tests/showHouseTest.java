package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class showHouseTest {
	@Given("The owner has showed the house information")
	public void the_owner_has_showed_the_house_information() {
	    
	}

	@When("Enter a number {int}")
	public void enter_a_number(Integer int1) {
	   
	}

	@Then("View all available homes information")
	public void view_all_available_homes_information() {
		 assertTrue(main.showHouse());
	}

}
