package org.task.maven.MavenTasks;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\god\\eclipse-workspace\\MavenTasks\\FileName.json");
		JSONParser parser= new JSONParser();
		Object obj = parser.parse(file);
		JSONObject j= (JSONObject)obj;
		Object data = j.get("data");
		JSONObject objdata= (JSONObject)data;
		Object objId = objdata.get("id");
		System.out.println(objId);
		Object objEmail = objdata.get("email");
		System.out.println(objEmail);
		Object objFn = objdata.get("first_name");
		System.out.println(objFn);
		Object objLn = objdata.get("last_name");
		System.out.println(objLn);
		Object objAv = objdata.get("avatar");
		System.out.println(objAv);
				
		Object sup = j.get("support");
		JSONObject objsup= (JSONObject)sup;
		Object objUrl = objsup.get("url");
		System.out.println(objUrl);
		Object objText = objsup.get("text");
		System.out.println(objText);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
