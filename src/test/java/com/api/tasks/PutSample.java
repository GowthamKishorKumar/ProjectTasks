package com.api.tasks;

import org.junit.Test;
import io.restassured.response.ResponseBody;

public class PutSample extends BaseClass {
	@Test
	public void put() {
		addHeader("content-type", "application/json");
		addBody("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");
		reqType("PUT", "https://reqres.in/api/users/2");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		ResponseBody body = getResponseBody(response);
		System.out.println(body);
		System.out.println(getPrettyString(response));

	}

}
