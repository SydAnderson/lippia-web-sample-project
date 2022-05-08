Feature: Initial page
  As a web user
  I want purchase a flight from Buenos Aires to Bern and complete the form.

  @Test
  Scenario: As a web user i want to navigate PHPTravels "About us" page
    Given The user is in home page
    When The user search a flight between two days
    Then The search page list the available flight in those days

  @Test @Flight
  Scenario: As a web user I want to navigate PHPTravel and complete a cars booking process
    Given The user is in home page
    When The user search a flight between two days
    And  The user select the first result in the list
    And The user complete the flight booking
    Then a reservation number is provided