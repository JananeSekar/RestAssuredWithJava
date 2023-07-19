package restAPIBDD;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequestBDD {
@Test
	
	public void test1()
	{
		
		HashMap<String,Object> requestBody = new HashMap<String,Object>();
		requestBody.put("name", "Rakesh");
		requestBody.put("salary", "10000");
		
		RestAssured.given()
		
		.baseUri ("http://localhost:3000/employees")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(requestBody)
		.when()
				.put("/3")
				.then()
				.statusCode(200)
				.log()
				.body();
	}
}
