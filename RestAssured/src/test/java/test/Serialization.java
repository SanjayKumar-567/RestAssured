package test;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
	
	@Test(enabled = false)
	public void serialization() {
		Map<String, Object> jsonbody= new HashMap<String, Object>();
		List<String> skills = new ArrayList<String>();
		skills.add("CoreJava");
		skills.add("Rest assured");
		
		jsonbody.put("firstname", "sanjay");
		jsonbody.put("lastname", "kumar");
		jsonbody.put("email", "sanjay97@gmail.com");
		jsonbody.put("skills", skills);
		
		
		System.out.println(jsonbody);//normal java
		
		
	} @Test
	public void serializationWithJsonSimple() {
		   
		        // Set the base URI
		        RestAssured.baseURI = "http://localhost:5000/east-coast-hospital/api";

		        // Create the main JSON object
		        JSONObject requestBody = new JSONObject();//using json lib

		        // Create and populate the 'asset' object
		        JSONObject asset = new JSONObject();
		        asset.put("assetType", "room");
		        asset.put("status", "Operational");

		        // Create and populate the 'room' object
		        JSONObject room = new JSONObject();
		        room.put("name", "RM-107");
		        room.put("roomNumber", "700");
		        room.put("mobileNumber", "1234567890");
		        room.put("headPersonId", 1);
		        room.put("branchId", 1);

		        // Add the 'asset' and 'room' objects to the main requestBody
		        requestBody.put("asset", asset);
		        requestBody.put("room", room);

		        // Send PUT request with the JSON body
		        given()
		            .header("Content-Type", "application/json")
		            .body(requestBody.toJSONString())  // Pass the JSON object as the body
		        .when()
		            .post("/v1/asset/room/reg-asset-room")  // Replace with your actual PUT endpoint
		        .then()
		            .statusCode(201)  // Check for a successful response
		            .log().all();
		    
		}
 
	}
	


