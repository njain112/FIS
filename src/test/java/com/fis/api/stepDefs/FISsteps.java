package com.fis.api.stepDefs;


import com.fis.api.core.FIS_APItest;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;


public class FISsteps {


    public static Response response;

    private Scenario scenario;


    @Given("^User run testapi$")
    public void runTest() throws Exception {
        FIS_APItest.runAPI();

    }



}



