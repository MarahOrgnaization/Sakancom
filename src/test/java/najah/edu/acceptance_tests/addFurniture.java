package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.Main;
import classes.Tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addFurniture {
	@Given("information about Furniture")
	public void information_about_furniture() {
	   
	}

	@When("the Tenant enters the number {int}")
	public void the_tenant_enters_the_number(Integer int1) {
	    
	}

	@Then("Add Furniture")
	public void add_furniture() {
		Tenant tenantOne=new Tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		Main.getTenantList().add(tenantOne);
		assertTrue(Main.addFurniture("sofa set","mayar"));
	}

}
