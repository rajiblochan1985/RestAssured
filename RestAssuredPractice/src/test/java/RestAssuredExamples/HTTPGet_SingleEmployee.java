package RestAssuredExamples;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HTTPGet_SingleEmployee {
	
	@Test
	public void GetSingleEmployee()
	{
		//API - https://dummy.restapiexample.com/api/v1/employee/1
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employee/1";
		RequestSpecification httpReq = RestAssured.given();
		Response response= httpReq.request(Method.GET);
		
		String responsebody=response.getBody().asString();
		System.out.println("Response Body is+ " + responsebody);
		
		int statuscode = response.getStatusCode();
		System.out.println("Status Code is: "+ statuscode);
		Assert.assertEquals(statuscode, 200);
		
		JsonPath jpath=response.jsonPath();
		System.out.println("Status: "+ jpath.get("status"));
		System.out.println("Message: "+ jpath.get("message"));
		System.out.println("Employee ID: "+ jpath.get("data.id"));
		System.out.println("Employee Name: "+ jpath.get("data.employee_name"));
		System.out.println("Employee Age: "+ jpath.get("data.employee_age"));
		System.out.println("Employee Salary: "+ jpath.get("data.employee_salary"));
		
		//or For JSON Array, we have to get the data in a List
		//List<String> alldata = (List<String>) jpath.get("data");
		//for(String data:alldata)
		//{
			//System.out.println(data +" ");
		//}
		
	}

}
