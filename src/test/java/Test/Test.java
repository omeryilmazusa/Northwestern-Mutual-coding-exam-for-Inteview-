package Test;

import API_Models.Post;
import API_Models.User;
import Utilities.API_Utilities;
import Utilities.Configuration;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Post> posts =new ArrayList<>(  );

//     //   Response response = API_Utilities.GET_Posts(     Configuration.getProperty( "urlForAPIOfTypicode" ) );
//        Assert.assertEquals("API Server down", 200, response.statusCode());
//
//        System.out.println(response.asString());
    }

}
