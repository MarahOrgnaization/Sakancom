package najah.edu.acceptance_tests;

import static org.junit.Assert.assertTrue;

import classes.House;
import classes.Residence;
import classes.Apartments;
import classes.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class modifyInformation {
	@Given("Owner enters a new value at name of Residence")
	public void owner_enters_a_new_value_at_name_of_residence() {
	   
	}

	@When("Select the home ID and and choose a number {int}")
	public void select_the_home_id_and_and_choose_a_number(Integer int1) {
	   
	}

	@Then("name of Residence changed successfully")
	public void name_of_residence_changed_successfully() {

		assertTrue(Main.modifyInformation(1,1,"Hajj Ahmed"));
	}

	@Given("Owner enters a new value at location of the Residence")
	public void owner_enters_a_new_value_at_location_of_the_residence() {
	   
	}

	@Then("location of the Residence  changed successfully")
	public void location_of_the_residence_changed_successfully() {
		
		assertTrue(Main.modifyInformation(1,2,"nablus"));
	}

	@Given("Owner enters a new value at number of floors of the building")
	public void owner_enters_a_new_value_at_number_of_floors_of_the_building() {
	  
	}

	@Then("number of floors of the building changed successfully")
	public void number_of_floors_of_the_building_changed_successfully() {
		assertTrue(Main.modifyInformation(1,3,"3"));
	}

	@Given("Owner enters a new value at How many apartments per floor")
	public void owner_enters_a_new_value_at_how_many_apartments_per_floor() {
	
	}

	@Then("How many apartments per floor changed successfully")
	public void how_many_apartments_per_floor_changed_successfully() {
		assertTrue(Main.modifyInformation(1,4,"5"));
	}

	@Given("Owner enters a new value at number of the apartment")
	public void owner_enters_a_new_value_at_number_of_the_apartment() {
	  
	}

	@Then("number of the apartment changed successfully")
	public void number_of_the_apartment_changed_successfully() {
		assertTrue(Main.modifyInformation(1,5,"2"));
	}

	@Given("Owner enters a new value at What floor is the apartment on")
	public void owner_enters_a_new_value_at_what_floor_is_the_apartment_on() {
	  
	}

	@Then("What floor is the apartment on changed successfully")
	public void what_floor_is_the_apartment_on_changed_successfully() {
		assertTrue(Main.modifyInformation(1,6,"4"));
	}

	@Given("Owner enters a new value at How many people can the apartment accommodate")
	public void owner_enters_a_new_value_at_how_many_people_can_the_apartment_accommodate() {
	 
	}

	@Then("How many people can the apartment accommodate  changed successfully")
	public void how_many_people_can_the_apartment_accommodate_changed_successfully() {
		assertTrue(Main.modifyInformation(1,7,"5"));
	}

	@Given("Owner enters a new value at How space is the room")
	public void owner_enters_a_new_value_at_how_space_is_the_room() {
	   
	}

	@Then("How space is the room changed successfully")
	public void how_space_is_the_room_changed_successfully() {
		assertTrue(Main.modifyInformation(1,8,"400*450"));
	}

	@Given("Owner enters a new value at How much are the monthly fees")
	public void owner_enters_a_new_value_at_how_much_are_the_monthly_fees() {
	   
	}

	@Then("How much are the monthly fees changed successfully")
	public void how_much_are_the_monthly_fees_changed_successfully() {
		assertTrue(Main.modifyInformation(1,9,"700"));
	}

	@Given("Owner enters a new value at Do the fees include electricity and water")
	public void owner_enters_a_new_value_at_do_the_fees_include_electricity_and_water() {

	}

	@Then("Do the fees include electricity and water  changed successfully")
	public void do_the_fees_include_electricity_and_water_changed_successfully() {
		assertTrue(Main.modifyInformation(1,10,"false"));
	}

	@Given("Owner enters a new value at Is there free internet service")
	public void owner_enters_a_new_value_at_is_there_free_internet_service() {
	    
	}

	@Then("Is there free internet service  changed successfully")
	public void is_there_free_internet_service_changed_successfully() {
		assertTrue(Main.modifyInformation(1,11,"false"));
	}

	@Given("Owner enters a new value at Is there a private car park for the building")
	public void owner_enters_a_new_value_at_is_there_a_private_car_park_for_the_building() {
	    
	}

	@Then("Is there a private car park for the building changed successfully")
	public void is_there_a_private_car_park_for_the_building_changed_successfully() {
		assertTrue(Main.modifyInformation(1,12,"false"));
	}

	@Given("Owner enters a new value at Is elevator service available")
	public void owner_enters_a_new_value_at_is_elevator_service_available() {
	
	}

	@Then("Is elevator service available  changed successfully")
	public void is_elevator_service_available_changed_successfully() {
		assertTrue(Main.modifyInformation(1,13,"false"));
	}

	@Given("Owner enters a new value at picture of the apartment")
	public void owner_enters_a_new_value_at_picture_of_the_apartment() {
	   
	}

	@Then("picture of the apartment changed successfully")
	public void picture_of_the_apartment_changed_successfully() {
		assertTrue(Main.modifyInformation(1,14,"false"));
	}

}
