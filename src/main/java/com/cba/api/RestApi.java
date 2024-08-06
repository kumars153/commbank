package com.cba.api;

import com.cba.pojos.Pet;
import com.cba.utils.Globals;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.lang.reflect.Type;
import java.util.List;

public class RestApi {

    RequestSpecification httpRequest;
    Response response;

    public RestApi() {
        RestAssured.baseURI = Globals.BASE_URL;
        httpRequest = RestAssured.given();
    }

    public List<Pet> GetPetById(String petId) {
        String url = Globals.GET_PET_BY_ID;
        response = httpRequest
                .get(Globals.BASE_URL + url.replace("{petId}", petId))
                .thenReturn();
        return response.as(new TypeRef<List<Pet>>() {});
    }

    public List<Pet> GetPetsByStatus(String status) {
        String url = Globals.GET_PET_BY_STATUS;
        response = httpRequest
                .queryParam("status", status)
                .get(url)
                .thenReturn();
        return response.as(new TypeRef<List<Pet>>() {});
    }
}
