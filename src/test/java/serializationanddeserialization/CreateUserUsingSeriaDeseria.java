package serializationanddeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.CreateUserRequestBody;

public class CreateUserUsingSeriaDeseria {

	

	@Test
	public void createUser()
	{
		CreateUserRequestBody cs = new CreateUserRequestBody();
		
		cs.setId(0);
		cs.setUsername("Testusername");
		cs.setFirstName("Tom");
		cs.setLastName("Aveston");
		cs.setPassword("Test@1234");
		cs.setPhone("9876543210");
		cs.setEmail("test@test.com");
		cs.setUserStatus(0);
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		.header("Content-Type", "application/json")
		
		.body(cs)
		
		.when()
		
		.post("/user")
		
		.then()
		
		.extract()
		
		.response();
		
	String stringOutput	= resp.asPrettyString();
	
	
	System.out.println(stringOutput);
		
		
	}
}
