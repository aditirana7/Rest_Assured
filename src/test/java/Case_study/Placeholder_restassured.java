package Case_study;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Placeholder_restassured {

	@Test
	
	public void Method1()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"");
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response_preety=>"+response.prettyPrint());
		System.out.println("Response_content_type=>"+response.contentType());
		System.out.println("Response_body=>"+response.body());
		System.out.println("Response_time=>"+response.time());
	}
	
}
