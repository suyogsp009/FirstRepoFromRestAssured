package ecom;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class POST_Login extends BaseData {
	
	
	@Test
	public void loginToApp()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
	Response	resp = given()
		
		.header("Content-Type", "application/json")
		
		.body("{\r\n"
				+ "    \"userEmail\": \"testuser1234@gmail.com\", \r\n"
				+ "    \"userPassword\": \"Test@1234\"\r\n"
				+ "}")
		.log().all()
		
		.when()
		
		.post("api/ecom/auth/login")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
	
	
	JsonPath jp = resp.jsonPath();
	
	tokenId = jp.getString("token");
		
	userId = jp.getString("userId");
		
		
		
		
		
		
	}
	
	

}
