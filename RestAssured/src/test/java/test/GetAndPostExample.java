package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class GetAndPostExample {

	@Test(enabled = false)
	public void getMethod() {
		baseURI = "http://localhost:5000/east-coast-hospital/api";
		when().
		get("/v1/asset/bed/list-all-beds").
		then().
		statusCode(200).
		body("data[0].model", equalTo("DM-102"))//verifying single contents in response body[using json path finder]
				.body("data.model", hasItems("DM-105", "DM-102", "DM-106"));//verifying multiple contents in response body
		// log().all();

	}

	@Test(enabled = false)
	public void postMenthod() {//key=string,value=object
		//Map<String, Object> map= new HashMap<String, Object>();
		//map.put(DEFAULT_BODY_ROOT_PATH, map);
		
		baseURI = "http://localhost:5000/east-coast-hospital/api";
	given().
	 header("Content-Type"
				,"application/json").
    	body("{\r\n"
			+ "  \"asset\": {\r\n"
			+ "    \"assetType\": \"bed\",\r\n"
			+ "    \"status\": \"Operational\"\r\n"
			+ "  },\r\n"
			+ "  \"bed\": {\r\n"
			+ "    \"bedNumber\": 001,\r\n"
			+ "    \"model\": \"DM-111\",\r\n"
			+ "    \"serialNumber\" : \"Sf1997\",\r\n"
			+ "    \"roomNumber\": \"900\",\r\n"
			+ "    \"branchId\": 1\r\n"
			+ "  }\r\n"
			+ "}\r\n"
			+ "").
	when().
		post("/v1/asset/bed/reg-asset-bed")
		.prettyPrint();
		

	}@Test
	public void putMeathod() {
		baseURI = "http://localhost:5000/east-coast-hospital/api";
		given().
		header("Content-Type"
				,"application/json").
		body("{\r\n"
				+ "  \"bedId\": 4,\r\n"
				+ "  \"status\": \"Operational\",\r\n"
				+ "  \"bedNumber\": \"22222\",\r\n"
				+ "  \"model\": \"DM-102\",\r\n"
				+ "  \"roomId\": \"1111\",\r\n"
				+ "  \"serialNumber\": \"SN110332\",\r\n"
				+ "  \"branchId\": 2\r\n"
				+ "}").
		when().put("/v1/asset/bed/bed-update-id").then().log().all();
		//.prettyPrint();
		
		//setting parameter and header want to learn
		
       	}
	
	@Test
	public void createRoomFromJsonFile() {
		File json=new File("roomPost.json");
		given().baseUri("http://localhost:5000/east-coast-hospital/api")
		.header("Content-Type","application/json")
		.body(json)
		.when()
		.post("/v1/asset/room/reg-asset-room")
		.then().statusCode(201);
	}
}
