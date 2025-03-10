Feature: Launching the App

  Scenario: Launching the Webpage and performing required actions
    Given User Launch the Chrome browser
    When User opens URL "https://rahulshettyacademy.com/AutomationPractice/"
    Then User enters the required fields
    And User performs scrolling the Webtable action
    Then User counts the total amount in the Webtable
    And close the browser
