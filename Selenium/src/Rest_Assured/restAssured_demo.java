package Rest_Assured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class restAssured_demo 
{
	public static void main(String[] args)
	{
		//Validating the API's working fine or not, by 
		
		//given----> all input details
		//when---->Submit the reponse, HTTP method
		//then----> Validate the Response 
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}").when().post("/maps/api/place/add/json?qaclick123").then().log().all().assertThat().statusCode(200);
	}
}
