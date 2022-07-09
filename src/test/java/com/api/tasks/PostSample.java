package com.api.tasks;

import org.junit.Test;
import io.restassured.response.ResponseBody;

public class PostSample extends BaseClass {
	@SuppressWarnings("rawtypes")
	@Test
	public void post() {
		addHeader("Content_Type", "application/json");
		addBody("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}");
		reqType("POST", "https://reqres.in/api/users");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		ResponseBody body = getResponseBody(response);
		System.out.println(body);
		System.out.println(getPrettyString(response));

	}

}
