@Palindrom
Feature: Palindrom words and phrases

  Scenario Outline: check that word is palindrom
    Given I have work "<word>"
    Then Word is palindrom
    Examples:
      | word  |
      | мадам |
      | потоп |
      | шалаш |

  Scenario: check that word is not palindrom
    Given I have word "песня"
    Then Word is not palindrom

  Scenario: check that case ignored in the word
    Given I have word "АнНа"
    Then Word is palindrom

  Scenario: check that in frase ignored spaces
    Given I have phrase "Яд ем как мед я"
    Then Phrase is palindrom


  Scenario: check that if there is comma in phrase it isn't palindrom except cases when it is in the proper place
    Given I have phrase "Иди, Сеня, не сиди"
    Then Phrase is not palindrom

  Scenario: check that phrase with a lot of spaces also will be considered as palindrom
    Given I have phrase "Аргентина                    манит               негра"
    Then Phrase is palindrom