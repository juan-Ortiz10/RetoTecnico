# Author: Camilo Ortiz
  @stories
  Feature: As a user, I want to create meetings so I can do the sprint ceremonies
    Background: User logged in
    @HappyPath
    Scenario: Create a meeting successfully
      Given that the user created a Business Unit
      And he go to Meetings page
      When he create a new meeting
      Then the meet should display in the table