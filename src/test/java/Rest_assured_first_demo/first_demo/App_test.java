package Rest_assured_first_demo.first_demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class App_test {

	@Test
	public void GetBookDetails()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"");
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response=>"+response.prettyPrint());
		
	}
	@Test
	
	public void GetUserDetails() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"");
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response=>"+response.prettyPrint());
	}
	
	@Test
	
	public void GetBookingDetails() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"");
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response=>"+response.prettyPrint());
	}
	
	
}
