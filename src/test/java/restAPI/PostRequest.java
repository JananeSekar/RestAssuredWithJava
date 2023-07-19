package restAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
	@Test
	
	public void test1()
	{
		RestAssured.baseURI = "http://localhost:3000/employees";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body("{\r\n"
											+ "        \"name\": \"Panda\",\r\n"
											+ "        \"salary\": \"11000\"\r\n"
											+ "\r\n"
											+ "}")
				.post("/create");
		String body = response.getBody().asString();
		Assert.assertEquals(response.statusCode(),201);
		System.out.println("Response boby is " + body);
		System.out.println("Response code is " + response.statusCode());
	}

}
