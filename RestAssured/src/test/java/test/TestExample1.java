package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestExample1 {

	@Test
	public void test_1() {//import  io.restassured.RestAssured;
		//Response response=RestAssured.get("http://localhost:5000/east-coast-hospital/api/v1/asset/branch/list-all-branch");
		Response response=get("http://localhost:5000/east-coast-hospital/api/v1/asset/branch/list-all-branch");

		System.out.println(response.getStatusCode());
		//response.getStatusCode();
		System.out.println(response.getTime());
		//response.getTime();
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		int statusCode =response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}@Test
	public void test_2() {//import static io.restassured.RestAssured.*;
		baseURI="http://localhost:5000/east-coast-hospital/api";
		given().
		 get("/v1/asset/branch/list-all-branch").
		then().
		 statusCode(200).
		body("data[20].id", equalTo(37)).
		log().all();
	}
}
