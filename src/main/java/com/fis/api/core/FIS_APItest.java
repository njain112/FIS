package com.fis.api.core;


import com.fis.api.core.model.BPI;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import  static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.*;

import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;


public class FIS_APItest {


	public static void runAPI() throws IOException {
		RequestSpecBuilder requestBuild = new RequestSpecBuilder();
		requestBuild.setBaseUri("http://api.coindesk.com/v1/bpi");
		requestBuild.setBasePath("/currentprice.json");
		RequestSpecification spec = requestBuild.build();
		Response res = RestAssured.given(spec).get();

		JSONObject responseJSONObject = new JSONObject(res.getBody().asString());
		JSONObject object = responseJSONObject.getJSONObject("bpi");

		ObjectMapper om = new ObjectMapper();


		//TestCase1 - 3 fields with name validation
		Assert.assertEquals(object.length(),3);
		Set<String> bpiKeys  =  object.keySet();
		String[] bpis = new String[]{"EUR", "GBP", "USD"};
		boolean value = bpiKeys.containsAll(Arrays.asList(bpis));


		//TestCase1 - 3 fields with name validation
		Assert.assertEquals(String.valueOf(value),"true");

		for(String bpi : bpiKeys )
		{
			JSONObject bpiObject = object.getJSONObject(bpi);
			BPI bpiList = om.readValue(bpiObject.toString(), BPI.class);
			if(bpiList.getCode().equals("GBP"))
			{
				//testCase3- Validate GBP description
				System.out.print(bpiList.getDescription());
				Assert.assertEquals(bpiList.getDescription(),"British Pound Sterling");
			}

		}



	}


}
