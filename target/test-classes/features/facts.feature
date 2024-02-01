@facts
Feature: Facts

  Scenario: TC_01
    Given "fact" path parameters are prepared for the request
    And "max_length" query parameter is set 40 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify that the returned facts has min than 40 characters

  Scenario: TC_02
    Given "facts" path parameters are prepared for the request
    And "max_length" query parameter is set 40 for request
    And "limit" query parameter is set 5 for request
    When GET request sent response is saved
    Then verify response status code is 200
    Then verify that there are 5 object in returned data
    Then verify that each fact has min than 40 characters