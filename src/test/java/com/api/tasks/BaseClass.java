package com.api.tasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	 RequestSpecification reqSpec;
	 Response response;

	public void addHeader(String key, String value) {
		reqSpec=RestAssured.given().headers(key, value);
	}

	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public void pathParam(String key, String value) {
		reqSpec = reqSpec.param(key, value);
	}

	public void addBody(String reqbody) {
		 reqSpec = reqSpec.body(reqbody);

	}

	public Response reqType(String type, String endpoint) {
		switch (type) {
		case "GET":
			response = reqSpec.get(endpoint);
			break;
		case "POST":
			response = reqSpec.post(endpoint);
			break;
		case "PUT":
			response = reqSpec.put(endpoint);
			break;
		case "DELETE":
			response = reqSpec.delete(endpoint);
			break;
		default:
			break;
		}
		return response;
	}

	public int getStatusCode(Response response) {
		int status = response.getStatusCode();
		return status;
	}

	@SuppressWarnings("rawtypes")
	public ResponseBody getResponseBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}

	public String getAsString(Response response) {
		String asString = getResponseBody(response).asString();
		return asString;
	}

	public String getPrettyString(Response response) {
		String asPretty = getResponseBody(response).asPrettyString();
		return asPretty;
	}
}
