@mobile
Feature: As an User, I want to success login, So that i can see my home page

  @valid-user
  Scenario: As an user, i want to login with email or password
    Given user on the home page
    And user click next button
    And user click login page
    When user input "qe@mail.com" on email field
    And user input "123123" on password field