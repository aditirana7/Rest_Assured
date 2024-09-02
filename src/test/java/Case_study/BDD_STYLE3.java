package Case_study;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BDD_STYLE3 {
 @Test
 
	public void get_example3()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		Response response= RestAssured
				.given()
				.when()
				.get("/posts")
				.then()
				.statusCode(200)
				.extract().response();
		System.out.println(response.asString());
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response_preety=>"+response.prettyPrint());
		System.out.println("Response_content_type=>"+response.contentType());
		System.out.println("Response_body=>"+response.body());
		System.out.println("Response_time=>"+response.time());
}
}
