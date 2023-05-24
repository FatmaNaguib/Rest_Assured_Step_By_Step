package tests;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class PUT {

	@Test
	public void Put_Params() {
		baseURI = "https://reqres.in/api";
		
		JSONObject putParams = new JSONObject();
		
		putParams.put("name", "Fatma");
		putParams.put("job","PO");
		
		
		System.out.print(putParams.toJSONString());
		
		given().
			body(putParams.toString()).
		when().
			put("/api/users/2").
		then().
		statusCode(200).
	 	log().all();
		
		
				
				
		
	}
	
}
