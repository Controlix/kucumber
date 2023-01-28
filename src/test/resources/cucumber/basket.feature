Feature: buy apples

    Scenario: count apples in a full basket
        Given I put 3 apples in my basket
        When I count how many apples there are in the basket
        Then I have 3 apples