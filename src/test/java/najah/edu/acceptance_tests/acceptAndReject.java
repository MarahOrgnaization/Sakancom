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

public class acceptAndReject {
	@Given("information about housing")
	public void information_about_housing() {
	    
	}

	@When("the administrator accepts the home request")
	public void the_administrator_accepts_the_home_request() {

	}

	@Then("add a house in ads and remove a house in ad requests.")
	public void add_a_house_in_ads_and_remove_a_house_in_ad_requests() {
		Residence residenceOne = new Residence("Hijjawi","Ramallah",4,4,true,true);
		apartments objApartments=new apartments();
		 
	 	objApartments.setNumber(1);
		objApartments.setWhichFloor(1);
		objApartments.setMonthlyFee(600);
		objApartments.setNumberPerson(4);
		objApartments.setSpace("500*500");
		objApartments.setBedroomNumber(2);
		objApartments.setBathroomsNumber(2);
		objApartments.setBalconyNumber(1);
		objApartments.setPhoto("https://www.mmlakaty.com/%D8%AF%D9%8A%D9%83%D9%88%D8%B1");
		objApartments.setFreeInternet(true);
		objApartments.setFeesIncludeWaterElectricity(true);
	 
	 owners ownerOne = new owners("mayar","0569902837");
	 House houseOne=new House(1,residenceOne,objApartments,ownerOne,true);
		 assertTrue(main.acceptAndReject("y",houseOne));
	}

	@When("the administrator rejects the house request")
	public void the_administrator_rejects_the_house_request() {
	   
	}

	@Then("remove a home from ad requests")
	public void remove_a_home_from_ad_requests() {
		Residence residenceTow = new Residence("Hijjawi","Ramallah",4,4,true,true);
		apartments objApartments=new apartments();
		 
	 	objApartments.setNumber(1);
		objApartments.setWhichFloor(1);
		objApartments.setMonthlyFee(600);
		objApartments.setNumberPerson(4);
		objApartments.setSpace("500*500");
		objApartments.setBedroomNumber(2);
		objApartments.setBathroomsNumber(2);
		objApartments.setBalconyNumber(1);
		objApartments.setPhoto("https://www.mmlakaty.com/%D8%AF%D9%8A%D9%83%D9%88%D8%B1");
		objApartments.setFreeInternet(true);
		objApartments.setFeesIncludeWaterElectricity(true);
	 
	 owners ownerOne = new owners("mayar","0569902837");
	 House houseTow=new House(1,residenceTow,objApartments,ownerOne,true);
		 assertFalse(main.acceptAndReject("n",houseTow));
	}
}
