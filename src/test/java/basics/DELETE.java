package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DELETE {
	
	@Test
	public void deleteWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response resp = given()
		
		.header("x-api-key", "PMAK-6502740fbe424b1bfc6882ad-08166fa3e0eae4151332dce9e03bbbfef6")
		
		.when()
		
		.delete("workspaces/bcd7197e-803b-4bbf-a928-b6c4fe2f12e3")
		
		.then()
		
		.extract()
		
		.response();
		
		
String sresp	=	resp.asPrettyString();

System.out.println(sresp);
	}

}
