package restPackage;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Assignment {
	@Test
	public void getreq(){
		given().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).log().all();
	}
	@Test 
	public void postreq() {
		JSONObject js= new JSONObject();
		js.put("title", "New Post");
		js.put("body", "This is the body of new post");
		js.put("userId", 1);
		given().contentType("application/json").body(js.toString()).when().post("https://jsonplaceholder.typicode.com/posts")
		.then().statusCode(201).log().all();
	}
	@Test
	public void putreq() {
		JSONObject js= new JSONObject();
		js.put("title", "Updated Post");
		js.put("body", "This is the Updated body of the post");
		js.put("userId", 1);
		given().contentType("application/json").body(js.toString()).when().put("https://jsonplaceholder.typicode.com/posts/1")
		.then().statusCode(200).log().all();
	}
	@Test
	public void delreq(){
		given().delete("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();
	}
	
}
