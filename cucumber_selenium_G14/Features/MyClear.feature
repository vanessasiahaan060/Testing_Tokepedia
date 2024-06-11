Feature: Test Search Box Clearing on Tokopedia Website

Scenario: Test Clearing Search Box
  Given I am on the Tokopedia website for penghapusanpencarian
  When I clear the search box
  Then I should see the search box cleared
