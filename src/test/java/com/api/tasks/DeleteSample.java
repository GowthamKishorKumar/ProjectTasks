package com.api.tasks;

import org.junit.Test;

import io.restassured.response.ResponseBody;

public class DeleteSample extends BaseClass {
	@Test
	public void delete() {
		addHeader("Content_Type", "application/json");
		reqType("DELETE", "https://reqres.in/api/users");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		ResponseBody body = getResponseBody(response);
		System.out.println(body);
		System.out.println(getPrettyString(response));

	

	}
	
		
	}




