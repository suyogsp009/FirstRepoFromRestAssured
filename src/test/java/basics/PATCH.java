package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PATCH {
	
	@Test
	public void updateCollection()
	{
RestAssured.baseURI = "https://api.getpostman.com";
		
		Response resp = given()
		
		.header("x-api-key", "PMAK-6502740fbe424b1bfc6882ad-08166fa3e0eae4151332dce9e03bbbfef6")
		
		.header("Content-Type", "application/json")
		
		.body("{\r\n"
				+ "    \"collection\": {\r\n"
				+ "        \"info\": {\r\n"
				+ "            \"name\": \"Test collection updated name by script\"\r\n"
				+ "           \r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		
		.patch("/collections/f6ec923d-abe8-4a9b-a302-131a077dc6c9")
		
		.then()
		
		.extract()
		
		.response();
		
		
String sresp	=	resp.asPrettyString();

System.out.println(sresp);
	}

}
