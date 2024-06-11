Feature: Test Buka Bantuan on Tokopedia Website

Scenario: Test Buka Bantuan Functionality
  Given I am on the Tokopediawebsite for buka bantuan
  When I click on Buka Bantuan
  And I search for a question
  Then I see the search results
