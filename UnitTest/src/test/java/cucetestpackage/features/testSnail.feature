@Snail
Feature: Snail

  Scenario: check position of last element
    Given size of matrix snail is 20
    When create matrix
    And find last element
    Then last element is on the left bottom corner

  Scenario: check that start element = 1
    Given size of matrix snail is 25
    When create matrix
    Then check that first element is 1

  Scenario: check that appropriate element in matrix has correct number
    Given size of matrix snail is 22
    When create matrix
    Then check that element in matrix column 4, row 6 is 209
