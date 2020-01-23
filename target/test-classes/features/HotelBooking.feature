@f2
Feature: Verify booking functionality of Adactin

  Scenario Outline: Verify user can login to Adactin Home
    Given User is on Adactin Page
    When User enters "<username>" and "<password>"
    And User clicks Login Button
    Then User should be redirected to the Search Hotel page

    Examples: 
      | username   | password  |
      | aadhithyan | asdfgf123 |

  Scenario Outline: Complete the details
    Given User is in the Search Hotel page
    When User selects the location "<location>"
    And selects the Hotel name "<hotelName>"
    And selects the room type "<roomType>"
    And selects the number of rooms "<no>"
    And selects the check-in date "<chkinDate>"
    And selects the check-out date "<chkoutDate>"
    And selects the adults per room "<adults>"
    And selects the children per room "<children>"
    And clicks the search button
    Then User should be redirected to the Select Hotel page

    Examples: 
      | location | hotelName   | roomType | no      | chkinDate  | chkoutDate | adults  | children |
      | London   | Hotel Creek | Standard | 2 - Two | 15/01/2020 | 17/01/2020 | 2 - Two | 1 - One  |

  Scenario: Select the hotel
    Given User is in the Select Hotel Page
    When User selects the Hotel
    And clicks the continue button
    Then User should be redirected to the Book A Hotel page

  Scenario Outline: Payment Details
    Given User is in the Book A Hotel Page
    When User fills the "<firstname>" and "<lastname>"
    And fills the Billing Address "<billingaddress>"
    And fills the credit card no. "<ccno>"
    And selects the credit card type "<cctype>"
    And selects the Expiry month "<ccmonth>" and year "<ccyear>"
    And fills the cvv number "<cvv>"
    And clicks Book now button
    Then User should be redirected to the Booking confirmation page
    And User should verify the Order No.

    Examples: 
      | firstname  | lastname  | billingaddress                  | ccno             | cctype      | ccmonth  | ccyear | cvv |
      | aadhithyan | nagarajan | 256, GIU Street, Mayiladuthurai | 2345678934568765 | Master Card | February |   2021 | 952 |
