Feature: i need to verify whether the user is able to search for flight in webjet website

  Scenario: i need to validate the fight dropdown feature
    Given the user move the cursor to flight tab
    When i need to verify that user is able to see list of locations that flight can travel
    Then i need to verify that user is able to click domestic flight location

  Scenario Outline: i need to verify that user is able to book a flight after he is navigated to domestic flight adelaide
    Given i need to verify that user is able to enter "<sourceCity>"
    When i need to verify that user is able to select the TRAVEL DATE
    And i need to verify that user is able to select the noOfAdults , noOfchild, noOfInfants
    And i need to verify that user is able to select the "<seatClass>"
    Then i need to verify that user s able to click Search Flight button

    Examples: 
      | sourceCity                                 | seatClass       |
      | Anelghowhat, Vanuatu - Anelghowhat   (AUY) | Premium Economy |
      