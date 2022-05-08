Feature: Initial page As web user I want to navigate into PhpTravels and look into "About us" page

  @Test
  Scenario: As a web user i want to navigate PHPTravels "About us" page from header menu
    Given The user is in home page
    When The user go to "About Us" page
    Then The "About Us" page is displayed

  @Test
  Scenario: As a web user i want to navigate PHPTravels "About us" page
    Given The user is in home page
    When The user go to "Terms of Use" page
    Then The "Terms of Use" page is displayed