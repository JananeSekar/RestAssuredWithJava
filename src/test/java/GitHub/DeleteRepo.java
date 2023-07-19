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

public class DeleteRepo {

@Test
	
	public void test1() throws IOException
	{
	//byte[] dataFile = Files.readAllBytes(Paths.get("repodata.json"));

	//
	RestAssured.baseURI = "https://api.github.com/repos/jananesekar";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.auth().oauth2("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")
									
				.delete("/RestAssuredDemo");
		
		String body = response.getBody().asString();
		Assert.assertEquals(response.statusCode(),204);
		System.out.println("Response boby is " + body);
		System.out.println("Response code is " + response.statusCode());
	}
}
