package Case_study;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

public class username_password_post_request {
	public void post_method1()
	{
		JSONObject request=new JSONObject();
		request.put("username","admin");
		request.put("password", "password123");
		
		System.out.println(request);
		System.out.println(request.toString());
		
		//BDD Style
		given().body(request.toJSONString()).
		when().
		post("https://restful-booker.herokuapp.com/auth").
		then().statusCode(201);
		
	}
}
