Feature: create pet service feature
  I want to post the create pet api successfully

  @tag1
  Scenario: Send create pet api
    Given I will set Base URl
    When I create the request and execute
    Then I can see response code as "200"
    