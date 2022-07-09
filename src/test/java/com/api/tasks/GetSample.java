package com.api.tasks;

import org.junit.Test;

import io.restassured.response.ResponseBody;

public class GetSample extends BaseClass {
	@Test
	public void get() {
		addHeader("Content_Type", "application/json");
		pathParam("page", "2");
		reqType("GET", "https://reqres.in/api/users/2");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		ResponseBody body = getResponseBody(response);
		System.out.println(body);
		System.out.println(getPrettyString(response));
		


}}
