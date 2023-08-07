package najah.edu.acceptance_tests;


import static org.junit.Assert.assertEquals;


import classes.main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest{
	@Given(": I have a username and a password from the user\\(owner)")
	public void i_have_a_username_and_a_password_from_the_user_owner() {
	 
	}

	@When("The username Type is \\(owner) and username and password is correct .")
	public void the_username_type_is_owner_and_username_and_password_is_correct() {
	   
		  String experimental = main.login("bayan","333");
	}

	@Then("i can log in the system as an owner and The owner menu will appear")
	public void i_can_log_in_the_system_as_an_owner_and_the_owner_menu_will_appear() {
	  
		String ex=main.login("bayan","333");
		String actual="owner";
		assertEquals(ex,actual);
	}

	@Given(": I have a username and a password from the user \\(admin)")
	public void i_have_a_username_and_a_password_from_the_user_admin() {

	}

	@When("The username Type is \\(admin)and username and password is correct .")
	public void the_username_type_is_admin_and_username_and_password_is_correct() {
	   
	}

	@Then("i can log in the system as an admin and The owner menu will appear")
	public void i_can_log_in_the_system_as_an_admin_and_the_owner_menu_will_appear() {
	 
		String ex=main.login("marah","123");
				String actual="admin";
				assertEquals(ex,actual);
				}

	@Given(": I have a username and a password from the user \\(tenant)")
	public void i_have_a_username_and_a_password_from_the_user_tenant() {
	   
	}

	@When("The username Type is \\(tenant) and username and password is correct .")
	public void the_username_type_is_tenant_and_username_and_password_is_correct() {
	}

	@Then("i can log in the system as an tenant and The owner menu will appear")
	public void i_can_log_in_the_system_as_an_tenant_and_the_owner_menu_will_appear() {
		String ex=main.login("khalid","993");
		String actual="tenant";
		assertEquals(ex,actual);
	}
}

