package assertBed;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Bed {
	public void get_list_all_beds(){
		
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		given().when().get("/asset/bed/list-all-beds").then().statusCode(200);	
	}
	@Test
	public void postreg_asset_bed() {//not working
		
baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		
		String requestbody=("  {\r\n"
				+ "    \"asset\": {\r\n"
				+ "        \"assetType\": \"bed\",\r\n"
				+ "        \"status\": \"Operational\"\r\n"
				+ "    },\r\n"
				+ "    \"bed\": {\r\n"
				+ "        \"bedNumber\": 2077773,\r\n"
				+ "        \"model\": \"DM-2222\",\r\n"
				+ "        \"serialNumber\": \"Sf11323\",\r\n"
				+ "        \"roomNumber\": \"900\",\r\n"
				+ "        \"branchId\": 1\r\n"
				+ "    }\r\n"
				+ "}");
		
		given().contentType(ContentType.JSON).body(requestbody)
		.when().post("asset/bed/reg-asset-bed").then().statusCode(201);
		
	}
	
	public void put_bed_update_id() {//body is incorrect 
		
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		
		String requestbody=("  \"bedId\": 9,\r\n"
				+ "			  \"status\": \"Operational\",\r\n"
				+ "			  \"assetId\": \"10\",\r\n"
				+ "			  \"bedNumber\": \"202\",\r\n"
				+ "			  \"model\": \"DM-111\",\r\n"
				+ "			  \"roomNumber\": \"900\",\r\n"
				+ "			  \"branchId\": 1");
		
		given().body(requestbody)
		.when().put("asset/bed/bed-update-id").then().statusCode(200);	
		
	}
	
	
	

}
