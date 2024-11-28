package assertRoom;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Room {
	@Test(enabled = false)
	public void getlist_all_rooms() {
		baseURI=("http://localhost:5000/east-coast-hospital/");
		when().get("api/v1/asset/room/list-all-rooms").then().statusCode(200);
	
		
	}
	@Test
	public void post_list_room_view_id() {//not working
		//baseURI=("http://localhost:5000/east-coast-hospital/");
		String requestbody=	("{\r\n"
				+ "    \"roomId\":2\r\n"
				+ "}");

		given().contentType(ContentType.JSON).body(requestbody).
		when().post("http://localhost:5000/east-coast-hospital/api/v1/asset/room/list-room-view-id").then().statusCode(200);
		
	
		
	}@Test
	public void post_reg_asset_room() { 
		
		 
		 File json=new File("reg-asset-room.json");
		 baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		 given().contentType(ContentType.JSON).body(json).
		 when().
		 post("asset/room/reg-asset-room").
		 prettyPrint();
		// .then().statusCode(200);		
		
		
		
		
	}

}
