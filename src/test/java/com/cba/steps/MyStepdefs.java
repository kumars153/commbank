package com.cba.steps;

import com.cba.api.PetStoreApiTests;
import com.cba.api.RestApi;
import com.cba.assertions.Assertions;
import com.cba.pojos.Pet;
import com.cba.utils.Common;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

public class MyStepdefs extends Common {

    RestApi api;
    PetStoreApiTests tests;
    private List<Pet> expectedResponse, actualResponse;
    private List<Pet> findPetByIdRequest;
    private String id;

    @Before
    public void before() {
        api = new RestApi();;
        tests = new PetStoreApiTests();
    }

    @Given("pet Id details retrieved from data file {string} with {string}")
    public void aPetIdDetailsRetrievedFromDataFileWith(String dataFile, String scenario) throws IOException {
        findPetByIdRequest = readFile(dataFile, scenario);
        if(findPetByIdRequest.get(0).scenario.equalsIgnoreCase(scenario)) {
            id = findPetByIdRequest.get(0).id;
        }
        printLog("In Given Step");
    }

    @When("findPetById endpoint is triggered with petId")
    public void findpetbyidEndpointIsTriggered() {
        printLog("In When Step");
        actualResponse = api.GetPetById(id);
    }

    @Then("valid pet details are returned")
    public void petDetailsAreReturned() throws IOException {
        printLog("In Then Step");
        expectedResponse = readFile("FindPetByIdResponse.json", "");
        printLog("Find Pet By Id Response", actualResponse.get(0).id);
        Assertions.assertPetDetails(expectedResponse, actualResponse);
    }

    @When("findPetsByStatus endpoint is triggered with status")
    public void findpetsbystatusEndpointIsTriggered() {
        actualResponse = api.GetPetsByStatus(id);
    }

    @Then("all the pets details are returned")
    public void allThePetsDetailsAreReturned() throws IOException {
        expectedResponse = readFile("FindPetsByStatusResponse.json", "");
        printLog("Find Pets By Status Response", actualResponse.get(0).id);
        Assertions.assertAllPetsDetails(expectedResponse, actualResponse);
    }

    @When("addNewPetToStore endpoint is triggered")
    public void addnewpettostoreEndpointIsTriggered() {
        
    }

    @Then("error details are returned")
    public void errorDetailsAreReturned() {
        
    }

    @When("addNewPetToStore endpoint is triggered with status")
    public void addnewpettostoreEndpointIsTriggeredWithStatus() {
    }
}
