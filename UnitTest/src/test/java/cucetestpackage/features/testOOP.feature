@OOP
Feature: Figures

  @Nonstatic
  Scenario: check calculation of area for round
    Given I have radius 5
    When calculate area for the round
    Then Area is "15.707963267948966"

  @Nonstatic
  Scenario: check changing size for round with integer koef
    Given I have radius 5
    And I have koef "2"
    When change size of the radius
    And calculate area for the round
    Then Area is "31.41592653589793"

  @Nonstatic
  Scenario: check changing size for round with double koef
    Given I have radius 5
    And I have koef "0.55"
    When change size of the radius
    And calculate area for the round
    Then Area is "8.63937979737193"

  @Nonstatic
  Scenario: check changing size for round with big koef
    Given I have radius 5
    And I have koef "4684584"
    When change size of the radius
    And calculate area for the round
    Then Area is "7.358527339762144E7"

  @Nonstatic
  Scenario: check area for square with integer side
    Given I have side "5"
    When calculate area for the square
    Then Area for square is "25"

  @Nonstatic
  Scenario: check area for square with double side
    Given I have side "8.55"
    When calculate area for the square
    Then Area for square is "73.1025"

  @Nonstatic
  Scenario: check changing size for square with integer koef
    Given I have side "9"
    And I have koef "3"
    When change side size for square
    And calculate area for the square
    Then Area for square is "729"

  @Nonstatic
  Scenario: check changing size for square with double koef
    Given I have side "9"
    And I have koef "3.55"
    When change side size for square
    And calculate area for the square
    Then Area for square is "1020.8025"

  @Nonstatic
  Scenario: check that square object created and is not null
    Given I have side "5.5"
    Then area of the square is not null