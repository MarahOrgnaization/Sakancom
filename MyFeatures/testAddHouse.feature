
Feature: Testing add house

  Scenario: The owner adds a house
    Given The owner has entered the house information
    When add new house
    Then Add the house in the house array list of this owner
    
  Scenario: The admin adds a house
    Given The admin has entered the house information
    When add new house
    Then Add the house in the advertised houses arrayList 
