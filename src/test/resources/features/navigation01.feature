@navigation
  Feature: navigation
    Scenario: navigation test
      Given I navigate to "https://www.google.com"
      And I navigate to "https://www.youtube.com/"
      And I wait there a few moments
      And I navigate back
      And I navigate forward
      And I refresh the page
      Then I hold the browser again
