@Matrix
Feature: Matrix

  Scenario: check Matrix Creation
    Given I have set matrix size as 4
    When I run method which creates matrix
    Then Matrix created with 4 elements in line/column

  Scenario: check that matrix elements cannot be more than 9
    Given I have set matrix size as 5
    When I run method which creates matrix
    Then Matrix elements are no more than 9

  Scenario:  check that matrix elements cannot be less than 1
    Given I have set matrix size as 5
    When I run method which creates matrix
    Then Matrix elements are no less than 1