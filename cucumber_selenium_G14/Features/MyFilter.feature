Feature: Test Filter on Tokopedia Website

  Scenario: Test Filter for Skincare Products
    Given I am on the Tokopedia website for filter
    When I search for skincare products
    Then I apply the filter for product type
    And I see the filtered results
    
    
    