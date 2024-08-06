package com.cba.assertions;

import com.cba.pojos.Pet;
import org.testng.Assert;

import java.util.List;

public class Assertions {

    public static void assertPetDetails(List<Pet> expectedResponse, List<Pet> actualResponse) {
        Assert.assertEquals(expectedResponse, actualResponse, "GetPetDetails response didn't match");
    }

    public static void assertAllPetsDetails(List<Pet> expectedResponse, List<Pet> actualResponse) {
        Assert.assertEquals(expectedResponse, actualResponse, "FindByStatus endpoint response didn't match");
    }
}
