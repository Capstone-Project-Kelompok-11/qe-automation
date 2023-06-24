@UserRegistration
Feature: As an User, I want to register using the correct data

  Scenario: As an user, I want to register using the correct data
    And user click signup page
    When user input "tessts" on fullname field
    And user input "tesstss122121" on username field
    And user input "tesstss13232121@mail.co" on email signup field
    And user input "User@1234" on password signup field
    And user input "User@1234" on confirmpassword field
    Then user click sign up button
