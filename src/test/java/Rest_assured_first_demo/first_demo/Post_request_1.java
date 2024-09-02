package Rest_assured_first_demo.first_demo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Post_request_1 {
	
	@Test
	public void post_method()
	{
		JSONObject request=new JSONObject();
		request.put("name","morpheus");
		request.put("job", "leader");
		
		System.out.println(request);
		System.out.println(request.toString());
		
		//BDD Style
		given().body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201);
		
	}
}
