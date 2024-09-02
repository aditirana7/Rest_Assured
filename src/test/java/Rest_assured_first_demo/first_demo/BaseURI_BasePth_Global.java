package Rest_assured_first_demo.first_demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseURI_BasePth_Global {

	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		RestAssured.basePath="/booking";
	}
	
	@Test
	public void request1()
	{
		RequestSpecification request= RestAssured.given();
		Response response= request.get();
		System.out.println(response.asString());
		System.out.println("Status Recieved=>"+response.getStatusLine());
		System.out.println("Response=>"+response.prettyPrint());
	}
}
