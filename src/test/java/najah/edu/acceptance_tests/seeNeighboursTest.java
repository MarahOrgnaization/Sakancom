package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import classes.tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class seeNeighboursTest {

	@Given("The tenant want to know the neighbours")
	public void the_tenant_want_to_know_the_neighbours() {
	}

	@Then("View all the student neighbours")
	public void view_all_the_student_neighbours() {
		tenant tenant1=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		main.tenantList.add(tenant1);
		assertTrue(main.SeeNeighbours("mayar"));
	}	
}
