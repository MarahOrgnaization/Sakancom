Feature: Login  


Scenario: owner enter a true username and True password
    Given : I have a username and a password from the user(owner)
    
    When The username Type is (owner) and username and password is correct .
    Then i can log in the system as an owner and The owner menu will appear

Scenario: admin enter a true username and True password
    Given : I have a username and a password from the user (admin)
    When  The username Type is (admin)and username and password is correct .
    Then i can log in the system as an admin and The owner menu will appear


Given : I have a username and a password from the user (tenant)
Scenario: tenant enter a true username and True password
    Given : I have a username and a password from the user (tenant)
 
    When  The username Type is (tenant) and username and password is correct .
    Then i can log in the system as an tenant and The owner menu will appear