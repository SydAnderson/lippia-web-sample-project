Feature: Initial page
  As a web user
  I want purchase a flight from Buenos Aires to Bern and complete the form.

  @Test @Flight
  Scenario: As a web user i want to navigate PHPTravels "About us" page
    Given The user is in home page
    When The user search a flight between two days
    Then The search page list the available flight in those days