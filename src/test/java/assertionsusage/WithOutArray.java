package assertionsusage;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WithOutArray {
	

	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://reqres.in";
		
	Response response = given()
		
		.when()
		
		.get("/api/users/2")
		
		.then()
		
		.assertThat()
		
	
		
		.extract()
		
		.response();
	
	
	}
	

}
