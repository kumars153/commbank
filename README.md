# Commbank - Pet Store
This Cucumber Rest Assured automation framework is created for Commonwealth Bank to test Pet Store endpoints.
The purpose of this regression suite is test APIs end to end covering all scenarios.

###Tools:
1. Cucumber
2. Rest Assured
3. Java
4. Junit
5. Maven
6. Allure

### EndPoints
1. FindPetById
2. FindPetsByStatus
3. AddNewPet

### Project Structure
1. api/PetStoreApiTests.java is the runner class which is used to execute required tests such as Smoke/Regression/feature.
2. /features folder contains all the endpoint features written in gherkin.
3. steps/MyStepdefs.java contains corresponding java code for each steps from feature files.
4. api/RestApi.java contains Rest Assured API requests and responses like with corresponding methods (GET/POST).
5. pojos contains java DTOs to hold bulk data in objects.
6. assertions/Assertions.java contains response assertion validations.
7. Common.java contains common util methods and Globals.java contains all the global variables.
8. /config folder contains environment specific details.
9. /data folder contains request and response data.
10. /allure-report contains results report in html format.

### How to run tests
1. Checkout code from github.
2. Run **mvn clean compile** command from terminal to build and generate required classed in /target folder.
3. Run Tests.
   1. Below are the several ways to run tests.
      1. Run **mvn test** command from terminal to run all the tests.
      2. Run CucumberTests() method from api/PetStoreApiTests.java with appropriate tag.
         1. @Smoke.
         2. @Regression.
         3. @Positive/@Negative.
         4. @FindPetDetailsById/@FindPetDetailsByStatus/@AddNewPetToStore.
   2. Run individual scenarios from features/<feature-name>.feature file.
4. Run **mvn allure:serve** command from terminal to generate allure reports.
   1. To view report, open allure-report/index.html.
