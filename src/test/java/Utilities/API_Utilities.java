package Utilities;

import API_Models.RequestBody;
import API_Models.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API_Utilities {
// CRUD Operation. One method for each operation.
    // One method should handle any APIs we are hitting.

    private static ResponseBody responseBody;
    private static String uri;

    public static String getUri() {
        return uri;
    }

    public static void setUri() {
        API_Utilities.uri = Configuration.getProperty("BaseurlForAPIOfTypicode");;
    }



    public static void hitGET(String resource){
         uri += resource;
        Response response = RestAssured.get(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }
        catch (Exception j){
            j.printStackTrace();
        }
    }

    public static ResponseBody getResponseBody(){
        return responseBody;
    }

    public static void hitPOST(String resource, RequestBody body){
        String uri = Configuration.getProperty("BaseurlForAPIOfTypicode") + resource;

        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";
        try {
            bodyJSON = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).when().post(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        try{
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }
        catch (Exception j){
            j.printStackTrace();
        }
    }


    public static void hitDELETE(String resource){
        String uri = Configuration.getProperty("BaseurlForAPIOfTypicode") + resource;

        Response response = RestAssured.delete(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }
        catch (Exception j){
            System.err.println("WARNING!\nResponse couldn't map properly with Jackson Library");
        }

    }


    public static void hitPUT(String resource, RequestBody body){
        String uri = Configuration.getProperty("BaseurlForAPIOfTypicode") + resource;

        ObjectMapper objectMapper = new ObjectMapper();

        String bodyJson = "";
        try{
            bodyJson = objectMapper.writeValueAsString(body);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Response response = RestAssured.given().contentType( ContentType.JSON).body(bodyJson).when().put(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
