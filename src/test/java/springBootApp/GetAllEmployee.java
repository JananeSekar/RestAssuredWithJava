package springBootApp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployee {
@Test
	
	public void test1()
	{
		RestAssured.baseURI = "http://localhost:8088/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get();
		
		String body = response.getBody().asString();
		Assert.assertEquals(response.statusCode(),200);
		System.out.println("Response boby is " + body);
		System.out.println("Response code is " + response.statusCode());
	}

}
