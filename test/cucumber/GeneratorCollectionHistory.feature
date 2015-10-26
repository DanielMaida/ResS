Feature:
  As a residue generator
  I want to see the history of my previous pickup requests
  So that i can keep the track of my pickup requests

  Scenario: User has a history of pickup requests.
    Given I am a residue generator logged on the system which id is "42"
    When  I want to see my previous pickup requests
    Then  the system should return them to me

