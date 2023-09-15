package dataextraction;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetOutputParameters {
	
	

	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://reqres.in";
		
	Response response = given()
		
		.when()
		
		.get("/api/users/2")
		
		.then()
		
		.extract()
		
		.response();
	
	System.out.println(response);
	
	String stringResponse = response.asPrettyString();
	
	System.out.println(stringResponse);
	
int statuscode = response.getStatusCode();// to fetch the status code of the response

System.out.println("Status code is :"+statuscode);
	
	Assert.assertEquals(statuscode, 200);
	
	long timeTaken = response.getTime();// to fetch the time taken to get the response
	
	System.out.println(timeTaken);
	
	
Headers allheaderContent = response.getHeaders();

List<Header> listOfHeaders = allheaderContent.asList();

System.out.println(listOfHeaders);

String value = response.getHeader("Content-Type");

System.out.println(value);

	
	}

}
