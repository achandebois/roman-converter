Feature: Feature of roma literal

  Scenario: Calling the service and return roman literal
    Given roman converter initialized
    When I call the roman converter service with a number with the value 14
    Then it should display 'XIV'