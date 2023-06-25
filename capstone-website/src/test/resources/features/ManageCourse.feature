Feature: Admin be able to manage course
  As admin
  I want to manage course
  So that I can manage my courses

  @create-course
  Scenario: As user, I have be able to create course
    Given I am on the login page to create course
    When I login to create course
    And I am on the home page to create course
    And I click course to create course
    And I click on new course button
    And I fill the course data form
    Then I click upload
