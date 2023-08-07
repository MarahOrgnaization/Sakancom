package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.main;
import classes.tenant;
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
		tenant tenantOne=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		main.tenantList.add(tenantOne);
		assertTrue(main.addFurniture("sofa set","mayar"));
	}

}
