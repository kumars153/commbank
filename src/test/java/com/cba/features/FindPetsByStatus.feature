@Regression @FindPetDetailsByStatus
Feature: Find Pets Details by Status feature tests

  @Positive
  Scenario Outline: Find Pets By Status endpoint tests
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When findPetsByStatus endpoint is triggered with status
    Then all the pets details are returned

    @Smoke
    Examples:
      | scenario                              | file                  |
      | get pet details with available status | FindPetsByStatus.json |

  @Negative
  Scenario Outline: Find Pets By Status endpoint tests error messages
    Given pet Id details retrieved from data file "<file>" with "<scenario>"
    When findPetsByStatus endpoint is triggered with status
    Then error details are returned

    Examples:
      | scenario                                | file                  |
      | get pet details with unavailable status | FindPetsByStatus.json |
