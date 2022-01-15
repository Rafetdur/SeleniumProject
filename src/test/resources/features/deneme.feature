
Feature: deneme
  Background:
    Given I initialize chrome driver
    When I go to "https://www.trendyol.com" url
    Then I see home page

  Scenario:
    When I click element: popup index: 1
    When I send text "ELBİSE" to  "aramaalanı" element
    When I click element: giris index: 1

