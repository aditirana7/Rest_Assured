package Rest_assured_first_demo.first_demo;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class BDD_Style {
	
	@Test
	
	public void get_example()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		Response response= RestAssured
				.given()
				.when()
				.get("posts/1")
				.then()
				.statusCode(200)
				.extract().response();
		System.out.println(response.asString());
		Assert.assertEquals(response.jsonPath().getInt("id"),1);
		Assert.assertEquals(response.jsonPath().getString("title"), "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
				
				
				
				
				
				
		
		
	}
}
