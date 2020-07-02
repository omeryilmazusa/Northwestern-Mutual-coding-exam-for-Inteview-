package StepDefinitions.TypiCodeAPI_stepDefs;

import API_Models.Comment;
import API_Models.Post;
import API_Models.ResponseBody;
import Utilities.API_Utilities;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class TypicodeAPI_stepDefs {

    @Given("I set Typicode REST API url")
    public void i_set_Typicode_REST_API_url() {
       API_Utilities.setUri();
    }

    @Given("I Set GET posts with  api endpoint {string}")
    public void i_Set_GET_posts_with_api_endpoint(String resource) {
        API_Utilities.hitGET( resource );


    }

    @When("I Set Responsebody to catch data")
    public void i_Set_Responsebody_to_catch_data() {
       ResponseBody responseBody=API_Utilities.getResponseBody();

    }

    @When("Validate response code {int} and postsSize is {int}")
    public void validate_response_code_and_postsSize_is(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I Set PUT posts api endpoint for {string}")
    public void i_Set_PUT_posts_api_endpoint_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I Set Update request Body")
    public void i_Set_Update_request_Body() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Send PUT HTTP request")
    public void send_PUT_HTTP_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I receive valid HTTP response code {int} for {string}")
    public void i_receive_valid_HTTP_response_code_for(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Response BODY {string} is non-empty")
    public void response_BODY_is_non_empty(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I Set DELETE posts api endpoint for {string}")
    public void i_Set_DELETE_posts_api_endpoint_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I Send DELETE HTTP request")
    public void i_Send_DELETE_HTTP_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("I Send PUT HTTP request")
    public void i_Send_PUT_HTTP_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Validate PUT and DELETE response same data")
    public void validate_PUT_and_DELETE_response_same_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



//

    public void studentGet() throws Exception {





        //////////////
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(response.statusCode());


        ObjectMapper objectMapper = new ObjectMapper();
        String format="{"+"\""+"posts"+"\""+":"+response.asString()+"}";
        System.out.println(format);
        ResponseBody responseBody = objectMapper.readValue(format, ResponseBody.class);


        System.out.println(responseBody.getPosts().size());


    }

}