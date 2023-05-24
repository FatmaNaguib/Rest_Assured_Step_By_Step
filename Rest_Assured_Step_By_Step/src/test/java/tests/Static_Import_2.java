package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import io.restassured.response.Response;

public class Static_Import_2 {
	
	@Test
	
		public void test_1() {
		
			Response response =get("https://reqres.in/api/users?page=2");
			
			int statusCode = response.statusCode();			
			assertEquals(statusCode,200);
				
		}
	
	@Test
	public void test_2() {
		baseURI = "https://reqres.in/api/users?page=2";
		
		given().
			get(baseURI).
		then().
			statusCode(200).
			body("data[1].id",equalTo(8)).
			log().all();
		
	}


}