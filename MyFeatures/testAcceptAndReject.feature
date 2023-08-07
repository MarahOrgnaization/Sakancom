Feature: the ability to accept and reject the house 

Scenario: the admin accepts the housing advertisement request
Given information about housing
When the administrator accepts the home request
Then add a house in ads and remove a house in ad requests.

Scenario: the admin rejects the housing advertisement request
Given information about housing
When the administrator rejects the house request
Then remove a home from ad requests