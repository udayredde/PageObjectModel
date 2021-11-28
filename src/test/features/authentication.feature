Feature:Automation Practice Login feature //gherkin language

  #happy path scenario
  @smoke
  Scenario: Verify User is on Authentication Page
    Given Is User on the Home page
    When User select signIn
    Then User should be on Authentication page