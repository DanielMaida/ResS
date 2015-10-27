Feature:
  As a residue generator properly logged on the system
  I want to create a pickup request
  So that the residue collectors can receive a notification to do the collection.

  Scenario: Pickup request success.
    Given there is no open pickup request for the residue generator with the username "testdummy"
    When  I make a pickup request for my "50" liters residue container
    Then  my pickup request should be stored in the database
    And   the collector should be warned by email

  Scenario: Pickup request fail
    Given there is no open pickup request for the residue generator with the id "42"
    When  I try to make a pickup request without the amount of residue value
    Then  the system shouldn't store the pickup request

  Scenario: Pickup request success interface
    Given I am at the pickup request page
    When  I fill the residue amount field with "60"
    And   submit the value
    Then  I should be taken to page with the pickup request information

  Scenario: Pickup request error interface
    Given I am at the pickup request page
    When  I let the residue amount field with a blank value
    And   submit the form
    Then  I should stay at the same page and see a validation error message


