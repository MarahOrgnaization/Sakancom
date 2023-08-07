package najah.edu.acceptance_tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import classes.House;
import classes.Residence;
import classes.apartments;
import classes.main;
import classes.owners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class acceptAndRejectTest {
	@Given("information about housing")
	public void information_about_housing() {
	    
	}

	@When("the administrator accepts the home request")
	public void the_administrator_accepts_the_home_request() {

	}

	@Then("add a house in ads and remove a house in ad requests.")
	public void add_a_house_in_ads_and_remove_a_house_in_ad_requests() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner1 = new owners("mayar","0569902837");
		 House House1=new House(1,Residence1,apartments1,owner1,true);
		 assertTrue(main.acceptAndReject("y",House1));
	}

	@When("the administrator rejects the house request")
	public void the_administrator_rejects_the_house_request() {
	   
	}

	@Then("remove a home from ad requests")
	public void remove_a_home_from_ad_requests() {
		Residence Residence2 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments2=new apartments(2,2,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner2 = new owners("mayar","0569902837");
		 House House2=new House(2,Residence2,apartments2,owner2,true);
		 assertFalse(main.acceptAndReject("n",House2));
	}
}
