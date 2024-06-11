Feature: Test Login on Tokopedia Website

  Scenario: Test Login with Valid Credentials
    Given I open Tokopedia website
    When I enter valid email
    Then I click the login button
    
