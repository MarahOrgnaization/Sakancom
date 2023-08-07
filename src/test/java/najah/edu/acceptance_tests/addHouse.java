package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;
import classes.*;
public class addHouse {
	@Given("The owner has entered the house information")
	public void the_owner_has_entered_the_house_information() {
	   
	}

	@When("add new house")
	public void add_new_house() {
	   
	}

	@Then("Add the house in the house array list of this owner")
	public void add_the_house_in_the_house_array_list_of_this_owner() {
		 Residence residenceOne = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 
		 Apartments objApartments=new Apartments();
		 
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
		 
		 Owners ownerOne = new Owners("mayar","0569902837");
		 House houseOne=new House(1,residenceOne,objApartments,ownerOne,true);
	   assertTrue(Main.addHouse(houseOne,"owner"));
	}
	@Given("The admin has entered the house information")
	public void the_admin_has_entered_the_house_information() {
	    
	}

	@Then("Add the house in the advertised houses arrayList")
	public void add_the_house_in_the_advertised_houses_array_list() {
		 Residence residenceOne = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 Apartments objApartments=new Apartments();
		 
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
		 
		 Owners ownerOne = new Owners("mayar","0569902837");
		 House houseOne=new House(1,residenceOne,objApartments,ownerOne,true);
	   assertTrue(Main.addHouse(houseOne,"admin"));
	}
}
