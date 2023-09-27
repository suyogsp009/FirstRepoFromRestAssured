package authschemes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BearerToken {
	
	@Test
	public void listAllRepositories()
	{
		RestAssured.baseURI = "https://api.github.com";
		
		given()
		
		.log().headers()
		
		.headers("Accept", "application/vnd.github+json")
		
		.headers("Authorization", "Bearer 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")
		
		.headers("X-GitHub-Api-Version", "2022-11-28")	
		
		.when()
		
		.get("user/repos")
		
		.then()
		
		.log().body()
		
		.extract()
		
		.response();
	}

}
