package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POSTWithGET {

	@Test
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		.header("Content-Type", "application/json")
		
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"TestuserTwo\",\r\n"
				+ "  \"firstName\": \"UserTwo\",\r\n"
				+ "  \"lastName\": \"Aug\",\r\n"
				+ "  \"email\": \"usertwo@test.com\",\r\n"
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
		
		
	}
	
	
	@Test
	public void getUserDetails()
	{
RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		.when()
		
		.get("/user/TestuserTwo")
		
		.then()
		
		.extract()
		
		.response();
				
		
		String value = resp.asPrettyString();
		
		System.out.println(value);
				
	}
	
}
