package com.restassured.prakash;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import model.Users;

public class RestTrain {
	
	//Get request
	@Test
	public void getUserList() {
		String endpoint ="https://reqres.in/api/users?page=2";
		var response = given().when().get(endpoint).then();
		//response.log().all();		
	}
	
	//Get request
	@Test
	public void getUser1() {
		String endpoint ="https://reqres.in/api/users/2";
		var response = given().when().get(endpoint).then();
		//response.log().all();		
	}
	
	//Get request
	@Test
	public void getUser2() {
		String endpoint ="https://reqres.in/api/users";
		var response = given().queryParam("id", 4).when().get(endpoint).then();
		//response.log().all();		
	}
	
	
	//Post request
	@Test
	public void createUser() {
		String endpoint ="https://reqres.in/api/users";
		String body = """
			{
			    "name": "morpheus",
			    "job": "leader"
			}
			""";
		var response = given().body(body).when().post(endpoint).then();
		//response.log().status();		
	}
		
	//Post request
	@Test
	public void createUser1() {
		String endpoint ="https://reqres.in/api/users";
		String body = """
			{
               "email": "eve.holt@reqres.in",
	           "password": "pistol"
        	}
			""";
		var response = given().body(body).when().post(endpoint).then();
		//response.log().status();		
	}
	
	//Put request
	@Test
	public void updateUser() {
		String endpoint ="https://reqres.in/api/users/2";
		String body = """
			{
	           "name": "morpheus",
               "job": "zion resident"
	       	}
			""";
	var response = given().body(body).when().put(endpoint).then();
	//response.log().status();		
	}
	
	//Delete request
	@Test
	public void deleteUser() {
		String endpoint ="https://reqres.in/api/users/2";
		var response = given().queryParam("id", 4).when().delete(endpoint).then();
		//response.log().all();		
	}
	
	//Serializing API request
	//Post
	@Test
	public void createAUser() {
		String endpoint ="https://reqres.in/api/users";
		Users user = new Users("morpheus","Electrical");
		var response = given().body(user).when().post(endpoint).then();
		//response.log().status();		
	}
	
	//Serializing API request
	//Put request
	@Test
	public void updateAUser() {
		String endpoint ="https://reqres.in/api/users/2";
		Users user = new Users("morpheus","Cosmology");
	    var response = given().body(user).when().put(endpoint).then();
	    //response.log().status();		
	}
	
	//Get request - Verify status code
		@Test
		public void getTheUserList() {
			String endpoint ="https://reqres.in/api/users?page=2";
			var response = given().when().get(endpoint).then();
			//response.assertThat().statusCode(200);  //other than 200 will give error
			
	}
	
	//Post request - Verify status code
		@Test
		public void createAUser1() {
			String endpoint ="https://reqres.in/api/users";
			Users user = new Users("morpheus","Electrical");
			var response = given().body(user).when().post(endpoint).then();
			//response.assertThat().statusCode(201);  //other than 201 will give error		
	}
	
	//Get request - Verify response body
		@Test
		public void getUserOf2() {
			String endpoint ="https://reqres.in/api/users/2";
			var response = given().when().get(endpoint).then();
			response.assertThat()
				.body("data.id", equalTo(2))
					.body("data.email", equalTo("janet.weaver@reqres.in"))
					.body("data.first_name", equalTo("Janet"))
					.body("data.last_name", equalTo("Weaver"))
					.body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));			
	}
	
	//Get request - data size greater than zero
				@Test
				public void getUserGreatthan() {
					String endpoint ="https://reqres.in/api/users/2";
					var response = given().when().get(endpoint).then();
					response.assertThat()
						.body("data.size()", greaterThan(0));
					//response.log().all();	
	}
				
				//Get request - verify response headers
				@Test
				public void getUsers() {
					String endpoint ="https://reqres.in/api/users/2";
					var response = given().when().get(endpoint).then();
					//response.log().headers();
					response.log().headers().assertThat().statusCode(200)
					         .assertThat().header("Content-Type", equalTo("application/json; charset=utf-8"))
					         .assertThat().header("Transfer-Encoding", equalTo("chunked"));
	}
				
	
	
	
}
