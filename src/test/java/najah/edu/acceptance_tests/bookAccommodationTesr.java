package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.House;
import classes.Residence;
import classes.apartments;
import classes.main;
import classes.owners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class bookAccommodationTesr {
	@Given("tenants wants to book accommodation via the app")
	public void tenants_wants_to_book_accommodation_via_the_app() {
	   }

	@Then("A new person is added to the apartment")
	public void a_new_person_is_added_to_the_apartment() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner1 = new owners("mayar","0569902837");
		 House House1=new House(1,Residence1,apartments1,owner1,true);
		 main.acceptAndReject("y",House1);
		assertTrue(main.bookacc(1,"mayar"));
	}

}
