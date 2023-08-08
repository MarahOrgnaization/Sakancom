package najah.edu.acceptance_tests;


import static org.junit.Assert.assertTrue;

import classes.House;
import classes.IdAndTennant;
import classes.Residence;
import classes.Apartments;
import classes.Main;
import classes.Owners;
import classes.Tenant;
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
		Tenant tenantOne=new Tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		Main.getTenantList().add(tenantOne);
		assertTrue(Main.showTenant("mayar"));
	}

	@Given("the tenant loged in")
	public void the_tenant_loged_in() {
	  
	}

	@When("tenant want the owner information")
	public void tenant_want_the_owner_information() {
	   
	}

	@Then("show information about owner")
	public void show_information_about_owner() {
		Residence residenceThree = new Residence("Hijjawi","Ramallah",4,4,true,true);
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
	 House houseThree=new House(1,residenceThree,objApartments,ownerOne,true);
		 Main.addHouse(houseThree, "owner");
		 Main.acceptAndReject("y",houseThree);
		 assertTrue(Main.bookAccommodation(1,"mayar"));
		 IdAndTennant IdAndTennant1=new IdAndTennant(4,"mayar");
		 Main.getIdAndTennantlist().add(IdAndTennant1);
		 IdAndTennant IdAndTennant2=new IdAndTennant(1,"osama");
		 Main.getIdAndTennantlist().add(IdAndTennant2);
		assertTrue(Main.showOwnerInformation("mayar"));
	}

	@When("the tenant want to show the rent")
	public void the_tenant_want_to_show_the_rent() {
	   
	}

	@Then("show the rent and how to pay")
	public void show_the_rent_and_how_to_pay() {
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
		 Main.addHouse(houseOne, "owner");
		 Main.acceptAndReject("y",houseOne);
		 Main.bookAccommodation(3,"mayar");
		 IdAndTennant IdAndTennantObj=new IdAndTennant(3,"mayar");
		 Main.getIdAndTennantlist().add(IdAndTennantObj);
		 Main.fullTenantList();
		assertTrue(Main.paymentt("y","mayar"));
	}

}
