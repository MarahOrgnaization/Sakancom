package najah.edu.acceptance_tests;


import static org.junit.Assert.assertTrue;

import classes.House;
import classes.IdAndTennant;
import classes.Residence;
import classes.apartments;
import classes.main;
import classes.owners;
import classes.tenant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tenantControlPanel {
	@Given("the tenant loged in and wants information")
	public void the_tenant_loged_in_and_wants_information() {
	  
	}

	@When("the tenant wants the information")
	public void the_tenant_wants_the_information() {
	   
	}

	@Then("Show tenant information")
	public void show_tenant_information() {
		tenant tenantOne=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		main.tenantList.add(tenantOne);
		assertTrue(main.showTenant("mayar"));
	}

	@Given("the tenant loged in")
	public void the_tenant_loged_in() {
	  
	}

	@When("tenant want the owner information")
	public void tenant_want_the_owner_information() {
	   
	}

	@Then("show information about owner")
	public void show_information_about_owner() {
		Residence Residence3 = new Residence("Hijjawi","Ramallah",4,4,true,true);
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
	 House House3=new House(1,Residence3,objApartments,ownerOne,true);
		 main.addHouse(House3, "owner");
		 main.acceptAndReject("y",House3);
		 assertTrue(main.bookAccommodation(4,"mayar"));
		 IdAndTennant IdAndTennant1=new IdAndTennant(4,"mayar");
		 main.idAndTennantlist.add(IdAndTennant1);
		 IdAndTennant IdAndTennant2=new IdAndTennant(1,"osama");
		 main.idAndTennantlist.add(IdAndTennant2);
		assertTrue(main.ShowOwnerInformation("mayar"));
	}

	@When("the tenant want to show the rent")
	public void the_tenant_want_to_show_the_rent() {
	   
	}

	@Then("show the rent and how to pay")
	public void show_the_rent_and_how_to_pay() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
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
	 House houseOne=new House(1,Residence1,objApartments,ownerOne,true);
		 main.addHouse(houseOne, "owner");
		 main.acceptAndReject("y",houseOne);
		 main.bookAccommodation(3,"mayar");
		 IdAndTennant IdAndTennant1=new IdAndTennant(3,"mayar");
		 main.idAndTennantlist.add(IdAndTennant1);
		 main.fullTenantList();
		assertTrue(main.paymentt("y","mayar"));
	}

}
