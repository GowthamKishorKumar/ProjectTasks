package org.task.maven.MavenTasks;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONArrayTask {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\god\\eclipse-workspace\\MavenTasks\\JArray.json");
		JSONParser parser= new JSONParser();
		Object obj = parser.parse(file);
		JSONObject j= (JSONObject)obj;
		Object objPg = j.get("page");
		System.out.println(objPg);
		System.out.println(j.get("per_page"));
		System.out.println(j.get("total"));
		System.out.println(j.get("total_pages"));
		Object data = j.get("data");
		JSONArray a = (JSONArray)data;
		for(int i = 0;i<a.size();i++) {
			Object o = a.get(i);
		JSONObject details= (JSONObject)o;
		System.out.println(details.get("first_name"));
		System.out.println( details.get("last_name"));
		System.out.println(details.get("email"));
		System.out.println(details.get("id"));
		System.out.println(details.get("avatar"));
		}
		Object sup = j.get("support");
		JSONObject objsup= (JSONObject)sup;
		Object objUrl = objsup.get("url");
		System.out.println(objUrl);
		Object objText = objsup.get("text");
		System.out.println(objText);
		
		
}}
