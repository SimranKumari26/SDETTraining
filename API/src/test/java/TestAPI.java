import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.hc.client5.http.utils.Base64;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestAPI {
		
	/*public static void main(String[] args) {
		
		Response r1 = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(r1.getStatusCode());
		System.out.println(r1.getStatusLine());
		System.out.println(r1.body().asString());
		System.out.println(r1.headers());
		
	}
	

@Test(enabled=false)
public void getmethor() {
	
	Response r1 = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(r1.getStatusCode());
	System.out.println(r1.getStatusLine());
	System.out.println(r1.body().asString());
	System.out.println(r1.headers());
	Assert.assertEquals(200,r1.getStatusCode());
	
}

//given - add authorization, param
//when - get(), ost(), put(), delete()
//then() - statuscode , line , message , headers

@Test
public void getmethor_bbdstyle() {
	//RestAssured.useRelaxedHTTPSValidation();   when getting certification error while performing api testing
	given().
	when().get("https://reqres.in/api/users?page=2").
	then().statusCode(200).statusLine("HTTP/1.1 200 OK").headers("Content-Type","application/json; charset=utf-8").body("data.id[2]",equalTo(9)).
	body("data.first_name",hasItems("Byron"));
	
	
	
}
	
	
	@Test(dataProvider="dp")
		public void post(String name, String job) {
		   
		JSONObject data = new JSONObject();
		data.put("name", name);
		data.put("job", job);
		
		System.out.println(data);
		given().when().body(data.toJSONString()).post("https://reqres.in/api/users").then().statusCode(201);
	}
	
	@DataProvider(name="dp")
		public Object[][] getdata(){
		
		Object[][] t1 = new Object[][] {
			
			{"fcgh" , "leader"},
			{"drftg", "developer"},
			{"fgjnj", "tester"}
		};
		return t1;			
		}*/
	
	@Test 
	public void auth() {
		String data = "postman:password";
		byte[] encodevalue = Base64.encodeBase64(data.getBytes());
		String encodedString = new String(encodevalue);
		given().headers("Authorization" , "Basic "+encodedString).
		when().get("https://postman-echo.com/basic-auth").
		then().statusCode(200);
		
	}
	}
	



















