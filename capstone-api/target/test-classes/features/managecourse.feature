@ManageCourse
Feature: As admin I want to see all course

  Scenario: GET - As a admin I want to see all course
    Given user set endpoint for get course
    And login as admin to get token
    When user send GET HTTP request
    Then user see status code 200
    And get all course show up

  Scenario: GET - As a user I want to see all course
    Given user set endpoint for get course
    And login as user to get token
    When user send GET HTTP request using normal token
    Then user see status code 401