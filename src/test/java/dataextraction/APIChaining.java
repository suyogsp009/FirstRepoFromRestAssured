package dataextraction;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIChaining {
	
	 String messageValue ;
	@Test(priority = 1)
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		.header("Content-Type", "application/json")
		
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"18Septuser\",\r\n"
				+ "  \"firstName\": \"username1\",\r\n"
				+ "  \"lastName\": \"Aug\",\r\n"
				+ "  \"email\": \"username1@test.com\",\r\n"
				+ "  \"password\": \"Test@1234\",\r\n"
				+ "  \"phone\": \"9876543213\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		
		.when()
		
		.post("/user")
		
		.then()
		
		.extract()
		
		.response();
		
	String stringOutput	= resp.asPrettyString();
	
	
	System.out.println(stringOutput);
		
	 JsonPath	jp = resp.jsonPath();
	 
	  messageValue = jp.getString("message");
	 
	 System.out.println(messageValue);
	}
	
	
	@Test(priority = 2)
	public void getUserDetails()
	{
RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		.when()
		
		.get("/user/18Septuser")
		
		.then()
		
		.extract()
		
		.response();
				
		
		String value = resp.asPrettyString();
		
		System.out.println(value);
		
	JsonPath jp	= resp.jsonPath();
	
	String idValue = jp.getString("id");
	
	System.out.println(idValue);
	
	
	Assert.assertEquals(idValue, messageValue);
		
				
	}

	
	
	
}
