package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PUT_UpdateWorkspace {
	
	
	@Test
	public void updateWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response	resp 	= given()
		
		.header("Content-Type", "application/json")
		
		.header("x-api-key", "PMAK-6502740fbe424b1bfc6882ad-08166fa3e0eae4151332dce9e03bbbfef6")
		
		.body("{\r\n"
				+ "    \"workspace\": {\r\n"
				+ "        \"name\": \"ATT15SeptWorkspace\",\r\n"
				+ "        \"type\": \"personal\",\r\n"
				+ "        \"description\": \"This is the updated workpace by ATT 19Aug batch\"\r\n"
				+ "    }\r\n"
				+ "}")
		
		.when()
		
		.put("workspaces/32fa9639-436c-4443-9ef9-4cc460fc4465")
		
		.then()
		
		.extract()
		
		.response();
		
	String	stringresp = resp.asPrettyString();
	
	System.out.println(stringresp);
		
		
	}
	

}
