package tests;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GET_and_POST_3 {

	@Test
	public void testGet() {
		
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[4].first_name",equalTo("George")).
			body("data.first_name",hasItems("Byron","George")).
			log().all();
		
		
	}
	
	@Test
	public void testPost() {
		
	//	Map<String, Object> map = new HashMap<String, Object>();
		//	 map.put("name", "Fatma");
		// map.put("job", "Lead");
		// System.out.println(map); 
		 
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
