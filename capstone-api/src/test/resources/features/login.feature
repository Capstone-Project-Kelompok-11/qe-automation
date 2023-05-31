@Login
Feature: As user I want to see home page

  Scenario: POST - As a user I success to login with valid data
    Given user set endpoint for login
    When user send POST HTTP request with valid data
    Then user see status code 201
    And get valid data
