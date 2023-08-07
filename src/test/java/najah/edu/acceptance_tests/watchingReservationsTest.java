package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class watchingReservationsTest {
	@Given("Admin wants to see reservations for homes")
	public void admin_wants_to_see_reservations_for_homes() {
	    
	}

	@When("the Admin enter the number {int}")
	public void the_admin_enter_the_number(Integer int1) {
	  
	}

	@Then("Shows him the ID of the house and who is the tenant")
	public void shows_him_the_id_of_the_house_and_who_is_the_tenant() {
		assertTrue(main.watchingReservations());
	}

}
