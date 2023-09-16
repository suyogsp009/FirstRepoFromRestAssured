package dataextraction;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractDataFromComplexJson {
	

	@Test
	public void getDataFromResponse()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		Response response = given()
			
			.when()
			
			.get("api/users?page=2")
			
			.then()
			
			.extract()
			
			.response();
		
		
		JsonPath jp = response.jsonPath();
		
	String lastname = jp.getString("data[0].last_name");
	
	System.out.println(lastname);//lawson
	
	
//	fetching the size of an array
	
	int sizeOfArray = jp.getInt("data.size()");
	
	System.out.println(sizeOfArray);//6
	
	
	
//	Assignment: WAP to print the lastname of a person whose id is 9
	
//	Assignment: WAP to print all the email addresses of the person
		
	}
			

}
