package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.Main;
import classes.Tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class seeNeighbours {

	@Given("The tenant want to know the neighbours")
	public void the_tenant_want_to_know_the_neighbours() {
	}

	@Then("View all the student neighbours")
	public void view_all_the_student_neighbours() {
		Tenant tenantOne=new Tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		Main.getTenantList().add(tenantOne);
		assertTrue(Main.seeNeighbours("mayar"));
	}	
}
