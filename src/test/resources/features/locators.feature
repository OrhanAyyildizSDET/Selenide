@locators
  Feature: locators
    Scenario: locators test
      Given User goes to "https://www.youtube.com"
      And User clicks the "Videolarınız"
      Then User see the "Sports"
      Then User hold the browser