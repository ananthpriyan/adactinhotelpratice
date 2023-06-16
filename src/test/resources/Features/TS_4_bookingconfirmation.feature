Feature: Booking Confirmation
@Booking
  Scenario Outline: verify Booking Confirmation Functionality with valid credentials
    When User is on login page
    Then User should perform login "<username>","<password>"
    Then User Should verify the success message after login "Hello Anand"
    And User should perfom "<location>","<hotel>","<roomtype>","<numberofrooms>","<checkindate>","<checkoutdate>","<adultsperroom>","<childsperroom>"
    Then User should verify success message after search button"Select hotel"
    And User should click on Radiobutton,continuebutton
    Then User Should navigate to Booking Confirmation page
    And User perform "<firstname>","<lastname>","<billing address>","<creditcardnum>","<creditcardtype>","<expirymonth>","<expyear>","<CVVnum>"
    Then User should get confirmation message " your booking is successful"

    Examples: 
      | username      | password     | location | hotel          | roomtype | numberofrooms | checkindate | checkoutdate | adultsperroom | childsperroom | firstname | lastname | billing address                     | creditcardnum    | creditcardtype | expirymonth | expyear | CVVnum |
      | Anandharaj123 | Kavinila@123 | London   | Hotel Sunshine | Double   | 2 - Two       | 15/06/2023  | 18/06/2023   | 2 - Two       | 2 - Two       | Anand     | Priyan   | NO.3,Sankarapuram,Kallakurichi dist | 8765490326758493 | VISA           | June        |    2022 |    546 |
