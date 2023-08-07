package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.House;
import classes.Residence;
import classes.Apartments;
import classes.Main;
import classes.Owners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class bookAccommodation {
	@Given("tenants wants to book accommodation via the app")
	public void tenants_wants_to_book_accommodation_via_the_app() {
	   }

	@Then("A new person is added to the apartment")
	public void a_new_person_is_added_to_the_apartment() {
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
		 Main.acceptAndReject("y",houseOne);
		assertTrue(Main.bookAccommodation(1,"mayar"));
	}

}
