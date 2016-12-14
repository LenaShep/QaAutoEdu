@SnailSpecial
Feature: Max Number in Snail

  Scenario Outline: Check That Snail Power Size Equals To Max Element
    Given I select matrix size as "<size>"
    When I run method which creates Snail matrix
    And I find max element in the matrix snail
    Then Max element is equal to "<expected>"

    Examples:
      | size | expected |
      | 5    | 25       |
      | 6    | 36       |
      | 25   | 625      |
      | 20   | 400      |
