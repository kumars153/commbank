@Regression @AddNewPetToStore
Feature: Add a new Pet to Store feature tests

  @Positive
  Scenario Outline: Add Pet to store endpoint tests
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When addNewPetToStore endpoint is triggered
    Then all the pets details are returned

    @Smoke
    Examples:
      | scenario                              | file                  |
      | add new pet details with valid details | AddNewPetToStore.json |

  @Negative
  Scenario Outline: Add Pet to store endpoint tests with invalid details
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When addNewPetToStore endpoint is triggered with status
    Then error details are returned

    Examples:
      | scenario                                | file                  |
      | add new pet details with invalid details | AddNewPetToStore.json |
