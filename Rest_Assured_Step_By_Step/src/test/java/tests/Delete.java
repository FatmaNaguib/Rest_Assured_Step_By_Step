package tests;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Delete {
	
	@Test
	public void delete() {
		baseURI = "https://reqres.in";
		
		when().
		delete("/api/users/2").
	then().
	statusCode(204).
 	log().all();
	
		
	}

}
