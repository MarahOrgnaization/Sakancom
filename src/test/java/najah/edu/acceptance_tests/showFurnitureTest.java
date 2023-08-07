package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import classes.tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class showFurnitureTest {
	@Given("The tenant add a furniture")
	public void the_tenant_add_a_furniture() {
	   
	}

	@Then("View all added furniture")
	public void view_all_added_furniture() {
		tenant tenant1=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		main.tenantList.add(tenant1);
		assertTrue(main.ShowFurniture("mayar"));
	}


}
