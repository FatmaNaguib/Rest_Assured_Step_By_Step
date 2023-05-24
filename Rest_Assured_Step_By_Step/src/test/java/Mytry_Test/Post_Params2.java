package Mytry_Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import groovy.util.logging.Log;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;
import java.util.Map;

public class Post_Params2 {

@Test
public void Post_params() {
	
	baseURI = "https://reqres.in/api";
	
	//Map<String, Object> map = new HashMap<String, Object>();
	
	JSONObject postParams = new JSONObject();
	
	postParams.put("name", "Fatma");
	 postParams.put("job", "Lead");
	
	System.out.println(postParams.toJSONString());
	
	given().
		body(postParams.toJSONString()).
	when().
		post("/users").
	then().
		statusCode(201).
		log().all();
	
}
	
}
