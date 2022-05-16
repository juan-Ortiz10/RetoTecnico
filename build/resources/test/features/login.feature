# Author: Camilo Ortiz
  @stories
  Feature: As user, I want to login in the Star Sharp page so I can create meetings
    @HappyPath
    Scenario: Login with right credentials
      Given that the user is on the Star Sharp page
      When the user logs in
      Then the page should display the Dashboard
