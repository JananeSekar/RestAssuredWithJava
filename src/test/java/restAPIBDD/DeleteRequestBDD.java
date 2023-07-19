package restAPIBDD;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestBDD {
	@Test
	public void test1()
	{
		RestAssured.given()
		.baseUri("http://localhost:3000/employees")
		.when()
		.delete("/3")
		.then()
		.log()
		.body()
		.statusCode(200);
		
	}
}
