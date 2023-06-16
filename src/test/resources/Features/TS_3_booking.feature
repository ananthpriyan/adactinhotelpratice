Feature: Booking Functionality

  @Booking
  Scenario Outline: Verify Adactin booking functionality
    When User is on login page
    Then User should perform login "<username>","<password>"
    Then User Should verify the success message after login "Hello Anand"
    And User should perfom "<location>","<hotel>","<roomtype>","<numberofrooms>","<checkindate>","<checkoutdate>","<adultsperroom>","<childsperroom>"
    Then User should verify success message after search button"Select hotel"
    And User should click on Radiobutton,continuebutton
    Then User Should navigate to Booking Confirmation page

    Examples: 
      | username      | password     | location | hotel          | roomtype | numberofrooms | checkindate | checkoutdate | adultsperroom | childsperroom |
      | Anandharaj123 | Kavinila@123 | London   | Hotel Sunshine | Double   | 2 - Two       | 15/04/2023  | 18/04/2023   | 2 - Two       | 2 - Two       |
