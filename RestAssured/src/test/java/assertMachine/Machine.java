package assertMachine;
import static io.restassured.RestAssured.*;

public class Machine {
	public void put_machine_update_id() {
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		String  requestbody=("{\r\n"
				+ "    \"machineID\": 2,\r\n"
				+ "    \"machineNumber\": \"103\",\r\n"
				+ "    \"assetId\": 10,\r\n"
				+ "    \"roomNumber\": \"101\",\r\n"
				+ "    \"model\": \"DM-1001\",\r\n"
				+ "    \"status\": \"In use\",\r\n"
				+ "    \"branchId\": 2\r\n"
				+ "}");
		
		
		given().header("Content-Type","application/json").body(requestbody).
		when().put("asset/machine/machine-update-id").
		then().statusCode(200);
		
	}
	public void post_list_machine_view_id() {
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		String  requestbody=("{\r\n"
				+ "    \"machineId\": 2\r\n"
				+ "}");
		given().header("Content-Type","application/json").body(requestbody).
		when().post("asset/machine/list-machine-view-id").
		then().statusCode(200);
		

		
		
	}
	public void post_reg_asset_machine() {
		baseURI=("http://localhost:5000/east-coast-hospital/api/v1/");
		String  requestbody=("{\r\n"
				+ "  \"asset\": {\r\n"
				+ "    \"assetType\": \"dialysis-machine\",\r\n"
				+ "    \"status\": \"In use\"\r\n"
				+ "  },\r\n"
				+ "  \"machine\": {\r\n"
				+ "    \"machineNumber\": 100,\r\n"
				+ "    \"serialNumber\": 200,\r\n"
				+ "    \"model\": \"DM-203\",\r\n"
				+ "    \"roomNumber\": \"203\",\r\n"
				+ "    \"branchId\": 2\r\n"
				+ "  }\r\n"
				+ "}");
		given().header("Content-Type","application/json").body(requestbody).
		when().post("asset/machine/reg-asset-machine").
		then().statusCode(200);

		
	}

}
