Feature: Categories

  @Categories

  Scenario: User should able to hover over main category and should able to click on sub-category successfully

    Given User is on homepage

    # You can change both below main category & sub-category.
    # When you change main category, do not forgot to update sub-category
    When user hover over main category "Computers"
    And click on sub-category "Software"

    # please update below sub-category same as above for ASSERT
    # You can update below sub-category wrong OR different then above to fail the test case
    Then User should able to see sub-category "Software" products






