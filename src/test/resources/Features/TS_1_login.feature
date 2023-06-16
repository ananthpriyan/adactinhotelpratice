
Feature: Login functionality

@Login1
  Scenario Outline: Verify Adactin login with valid credentials
    When User is on login page
    Then User should perform login "<username>","<password>"
    Then User Should verify the success message after login "Hello Anand"

    Examples: 
      | username      | password     |
      | Anandharaj123 | Kavinila@123 |

@Login2
  Scenario: Verify Adactin login with valid credentials with DataBase Value
    When User is on login page
    Then User should perform login 
    Then User Should verify the success message after login "Hello Anand"
