@ManageCourse
Feature: As admin I want to see all course

  Scenario: GET - As a admin I want to see all course
    Given user set endpoint for get course
    When user send GET HTTP request
    Then user see status code 200
    And get all course show up