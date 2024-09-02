package Case_study;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class BDD_STYLE2 {

	@Test
	
	public void get_example2()
	{
		RestAssured.baseURI="https://reqres.in";
		Response response= RestAssured
				.given()
				.when()
				.get("/api/users?page=2")
				.then()
				.statusCode(200)
				.extract().response();
		System.out.println(response.asString());
		//Assert.assertEquals(response.jsonPath().getInt("id"),7);
		//Assert.assertEquals(response.jsonPath().getString("title"), "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
	}
}

