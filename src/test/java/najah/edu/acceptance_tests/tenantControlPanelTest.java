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

public class tenantControlPanelTest {
	@Given("the tenant loged in and wants information")
	public void the_tenant_loged_in_and_wants_information() {
	  
	}

	@When("the tenant wants the information")
	public void the_tenant_wants_the_information() {
	   
	}

	@Then("Show tenant information")
	public void show_tenant_information() {
		tenant tenant1=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
		main.tenantList.add(tenant1);
		assertTrue(main.ShowTenant("mayar"));
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
		 apartments apartments3=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner3 = new owners("bayan","0569902837");
		 House House3=new House(4,Residence3,apartments3,owner3,true);
		 main.addHouse(House3, "owner");
		 main.acceptAndReject("y",House3);
		 assertTrue(main.bookacc(4,"mayar"));
		 IdAndTennant IdAndTennant1=new IdAndTennant(4,"mayar");
		 main.IdAndTennantlist.add(IdAndTennant1);
		 IdAndTennant IdAndTennant2=new IdAndTennant(1,"osama");
		 main.IdAndTennantlist.add(IdAndTennant2);
		assertTrue(main.ShowOwnerInformation("mayar"));
	}

	@When("the tenant want to show the rent")
	public void the_tenant_want_to_show_the_rent() {
	   
	}

	@Then("show the rent and how to pay")
	public void show_the_rent_and_how_to_pay() {
		Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400",2,2,1,"ww",true,true);
		 owners owner1 = new owners("bayan","0569902837");
		 House House1=new House(3,Residence1,apartments1,owner1,true);
		 main.addHouse(House1, "owner");
		 main.acceptAndReject("y",House1);
		 main.bookacc(3,"mayar");
		 IdAndTennant IdAndTennant1=new IdAndTennant(3,"mayar");
		 main.IdAndTennantlist.add(IdAndTennant1);
		 main.fullTenantList();
		assertTrue(main.Paymentt("y","mayar"));
	}

}
