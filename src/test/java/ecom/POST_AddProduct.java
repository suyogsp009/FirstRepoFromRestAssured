package ecom;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_AddProduct extends BaseData{
	
	@Test
	public void addProductToApp()
	{
		String path = System.getProperty("user.dir")+"//Sneakers2.png";
		File file = new File(path);
		RestAssured.baseURI = "https://rahulshettyacademy.com";
				
		given()
		.header("Authorization",tokenId)
		.param("productName", "Levis shoes")
		.param("productAddedBy", userId)
		.param("productCategory", "sports")
		.param("productSubCategory", "footwear")
		.param("productPrice", "1200")
		.param("productDescription", "Sneakers")
		.param("productFor", "Women")
		.multiPart("productImage",file )
		.when()
		.post("api/ecom/product/add-product")
		.then()
		
		.assertThat()
		
		.statusCode(201)
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
	}

}
