@Regression @FindPetDetailsById
Feature: Find Pet Details By ID feature tests

  @Positive
  Scenario Outline: Find Pet By ID endpoint tests
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When findPetById endpoint is triggered with petId
    Then valid pet details are returned

    @Smoke
    Examples:
      | scenario                | file             |
      | find pet by valid petId | FindPetById.json |

  @Negative
  Scenario Outline: Find Pet By ID endpoint tests error messages
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When findPetById endpoint is triggered with petId
    Then error details are returned

    Examples:
      | scenario                  | file             |
      | find pet by invalid petId | FindPetById.json |