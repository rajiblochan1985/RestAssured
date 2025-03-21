package RestAssuredExamples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/*
 given()
   - content type, set cookies, add auth, add param, set header info etc...
   
 when ()
   - get, post, put, delete  
 
 then ()
  - Validate status code, extract response, extract headers cookies & response body ....
  
 */
public class HTTPGet_Request {
	
	@Test
	void getUsersList() {
		
		given()
		
		.when()
		  .get("https://reqres.in/api/users?page=2")
		
		.then()
		  .statusCode(200)
		  .body("page",equalTo(2))
		  .log().all();
		
		
	}

}
