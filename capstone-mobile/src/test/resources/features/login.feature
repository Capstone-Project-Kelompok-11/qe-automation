Feature: As an User, I want to success login, So that i can see my home page

  Scenario: As an user, i want to login with email or password
    Given user on the home page
    And user click next button
    And user click login page
    When user input "rizkias1@gmail.com" on email field
    And user input "Rizki@123" on password field
    Then user click sign in button

  @TakeACourse
  Scenario: As an User, I want to view a course so that im able to take a course
    And user click view all in popular course
    And user click category All
    Then user see all the course that want to take

  @TakeAQuiz
  Scenario: As an User, I want to take a quiz in the course
    And user click my course button
    And user click any course
    When user click Take a Quiz
    Then user see all the quiz

  @ViewCourseHistory
  Scenario: As an User, I want to view my complete course history
    And user click my course button
    And user click complete section
    Then user can see all the complete history

  @SubmitRating
  Scenario: As an User, I want to submit rating for the course
    And user click my course button
    And user click complete section
    When user click get certificate
    And user give 5 star
    And user input "good" on review field
    Then user click on submit button

  @DownloadCertificate
  Scenario: As an User, I want to download my certificate after complete course
    And user click my course button
    And user click complete section
    When user click get certificate
    And user give 5 star
    And user input "nice" on review field
    Then user click on submit button
    Then user click on download button