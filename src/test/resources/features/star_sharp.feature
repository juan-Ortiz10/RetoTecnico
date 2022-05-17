# Author: Camilo Ortiz
  @stories
  Feature: As user, I want to login in the Star Sharp page so I can create meetings to do the sprint ceremonies
    Background:
      Given that the user is on the Star Sharp page
      And the user logs in
        |user |password|
        |admin|serenity|

    @scenario1
    Scenario Outline: Create a Bussiness Unit
      And he go to the Bussiness Units
      When he create a new unit
        | unitName |
        |<unitName>|
      Then the <unitName> should display in the tree
      Examples:
        |  unitName  |
        |UnidadCamilo|

    @scenario2
    Scenario Outline: Create a meeting successfully
      And he go to Meetings page
      When he create a new meeting
        | meetName | meetNumber | meetDateStart | meetDateEnd | unitName |
        |<meetName>|<meetNumber>|<meetDateStart>|<meetDateEnd>|<unitName>|
      Then the <meetName> should display in the table
      Examples:
        |  meetName  |meetNumber|meetDateStart|meetDateEnd|  unitName  |
        |PruebaCamilo|   2408   |  05/17/2022 |05/17/2022 |UnidadCamilo|