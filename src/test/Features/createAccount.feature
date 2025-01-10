Feature: Create Account function

  Scenario Outline: Check Create Account is successful with valid credentials

    Given browser is in open status
    And  user is on the page
    And clicks Create Account
    And user is on Create New Customer Account page
    And user enter "<FirstName>", "<LastName>", "<Email>", "<Password>", and "<Confirm Password>"
    And clicks Create an Account button
    Then user navigates to the Home page

    Examples:
      | FirstName | LastName    | Email                    | Password  | Confirm Password |
      | Shehani   | Wijebandara | abctestshehani@gmail.com | 12345Test | 12345Test        |

#  Scenario: Navigate through pages
#  Scenario: Sign out of the site
