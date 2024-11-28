package assertBranch;

import org.testng.annotations.Test;

import io.restassured.response.Response.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Branch {
	@Test(enabled = false)
	public void getMethod(){
	   	baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
	   // Response response=
	    		when().get("asset/branch/list-all-branch").
		then().statusCode(200).
		body("data[0].branchName",equalTo("pondicherry") ).
		body("data.branchName", hasItems("pondicherry","chennai","Lawspet")).
		
		//.extract().response();
	  //  System.out.println("Response Body: " + response.getBody().asString());
		log().all();
	}
	@Test
	public void postlist_branch_view_id(){
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		String requestbody=("{\r\n"
				+ "  \"branchID\":\"1\"\r\n"
				+ "  }\r\n"
				+ "");
		
		
		given().header("Content-Type"
				,"application/json").
		body(requestbody).
		when().post("asset/branch/list-branch-view-id").
		then().statusCode(200);
	}
	@Test
	public void postreg_asset_branch() {
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		given().body("{\r\n"
				+ "  \"asset\": {\r\n"
				+ "    \"assetType\": \"branch\",\r\n"
				+ "    \"status\": \"Operational\"\r\n"
				+ "  },\r\n"
				+ "  \"branch\": {\r\n"
				+ "    \"branchName\": \"tamilnadu\",\r\n"
				+ "    \"address\": \"chennai50 \",\r\n"
				+ "    \"latitude\": \"11.13333\",\r\n"
				+ "    \"longitude\": \"11.13333\",\r\n"
				+ "\r\n"
				+ "    \"mobileNumber\": \"3333333333\"\r\n"
				+ "  }\r\n"
				+ "}").when().post("asset/branch/reg-asset-branch").then().statusCode(200);
		
	}

}
