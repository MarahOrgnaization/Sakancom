Feature: Tenant Control Panel

  Scenario: Show tenant information
    Given the tenant loged in and wants information
    When the tenant wants the information
 		Then Show tenant information
  
 Scenario: show information about owner
    Given the tenant loged in 
    When tenant want the owner information
 		Then show information about owner
 		 
 		  Scenario: show the rent and how to pay 
    Given the tenant loged in  
    When the tenant want to show the rent
 		Then show the rent and how to pay