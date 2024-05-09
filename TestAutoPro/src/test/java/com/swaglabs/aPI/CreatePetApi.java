package com.swaglabs.aPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatePetApi {
	static String BaseUrl = null;
	RequestSpecification request;
	static Response  response;
	public void setBaseUrl() {
		BaseUrl = "https://petstore.swagger.io";
	}
	public void createPetAPiService() {
		 request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("accept","application/json");
		request.body("{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		response = request.post(BaseUrl+"/v2/pet");
		
	}
	public void verifyResposeCode() {
		System.out.println("response code : "+response.getStatusCode());
	}
}
