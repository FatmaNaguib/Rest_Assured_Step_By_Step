package Mytry_Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONObject;


public class Post_Parama {

	@Test
	
	public void post_params() {
		
		baseURI = "https://reqres.in/api";
		
		Map<String, Object> map = new HashMap <String, Object>();
		JSONObject postParams = new JSONObject();
		
		postParams.put("name","Fatma");
		postParams.put("job", "Leader");
		
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
