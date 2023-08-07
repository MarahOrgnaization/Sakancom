
Feature: book accommodation via the app

  Scenario: book accommodation via the app
    Given tenants wants to book accommodation via the app
    When tenants enters the number 4
    Then A new person is added to the apartment
  