@sonic
Feature: deneme
  Background:
    Given I initialize chrome driver
    When I go to "https://stackoverflow.com" url
    Then I see home page

  Scenario:
    When I click element: github index: 1
    When I click element: singup index: 1
    When I click element: question index: 1
    When I click element: search index: 1
    When I send text "C#" to  "SEARCH1" element
    Then I click "ENTER" keyboard button



