Feature:Automation Practice Login feature //gherkin language
  #happy path scenario
  Scenario: Verify User can Login successfully With Valid Credentials
    Given Iam on the Home page
    When I select signIn
    Then I should be on Authentication page
    When I provide userName as "udayredde453@gmail.com" and password as "password"
    And I Select Sign In
    Then I should be login Successfully
    And I should be on Account create Page

  #Unhappy path Scenario
  Scenario Outline:
    Given Iam on the Home page
    When I select signIn
    Then I should be on Authentication page
    When I provide userName as <username> and password <password>
    And I Select Sign In
    Then I should be on signIn page
    And I should see validation message as <validation message>
    Examples:
      | username             | password              | validation message         |
      | cvbdhjcbvh@gmail.com | gdhchdvchd            | Invalid email address.     |
      | cvbdhjcbvh@gmail.com | correctPassword       | Invalid email address.     |
      | 58gayathri@gmail.com | gdhchdvchd            | Authentication failed.     |
      |                      | gdhchdvchd            | An email address required. |
      |                      |                       | An email address required. |
      | 58gayathri@gmail.com | Password is required. | Authentication failed.     |

