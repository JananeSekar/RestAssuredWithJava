package GitHub;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateRepo {
@Test
	
	public void test1() throws IOException
	{
	byte[] dataFile = Files.readAllBytes(Paths.get("repodata.json"));

	
		RestAssured.baseURI = "https://api.github.com/user/repos";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.auth().oauth2("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")
									.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(dataFile)
				.post();
		
		String body = response.getBody().asString();
		Assert.assertEquals(response.statusCode(),201);
		System.out.println("Response boby is " + body);
		System.out.println("Response code is " + response.statusCode());
	}
}
