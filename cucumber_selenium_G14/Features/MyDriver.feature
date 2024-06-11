Feature: Test Pengiriman Option on Tokopedia Website

Scenario: Test Selecting a Delivery Option
  Given I am on the Tokopedia website for pengiriman
  When I search for a skincare product
  And I click on the product name
  And I click on the delivery option
  Then I should be able to select the delivery option
