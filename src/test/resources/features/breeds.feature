@breeds
Feature: Breeds

  Scenario: TC_01
    Given "breeds" path parameters are prepared for the request
    And "limit" query parameter is set 8 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify that the "country" value in the 3 index is "United States"

  Scenario: TC_02
    Given "breeds" path parameters are prepared for the request
    And "limit" query parameter is set 5 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify that there are 5 object in returned data
