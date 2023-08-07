package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.Main;
import classes.Tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class showFurniture {
	@Given("The tenant add a furniture")
	public void the_tenant_add_a_furniture() {
	   
	}

	@Then("View all added furniture")
	public void view_all_added_furniture() {
		Tenant tenantOne=new Tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		Main.getTenantList().add(tenantOne);
		assertTrue(Main.showFurniture("mayar"));
	}


}
