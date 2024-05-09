package com.swaglabs.SD;

import com.swaglabs.aPI.CreatePetApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostApiSD {

	CreatePetApi cPA;

	@Given("I will set Base URl")
	public void i_will_set_base_u_rl() {
		cPA = new CreatePetApi();
		cPA.setBaseUrl();
	}

	@When("I create the request and execute")
	public void i_create_the_request_and_execute() {
		cPA = new CreatePetApi();
		cPA.createPetAPiService();
	}

	@Then("I can see response code as {string}")
	public void i_can_see_response_code_as(String string) {
		cPA = new CreatePetApi();
		cPA.verifyResposeCode();
	}
}
