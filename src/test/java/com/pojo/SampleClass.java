package com.pojo;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleClass {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\god\\eclipse-workspace\\MavenTasks\\Array.json");
		ObjectMapper map = new ObjectMapper();
		
		Support sup= new Support("asdfghgfd.com", "qwertyqwert");
		 
		ArrayList<Datum> data = new ArrayList<Datum>();
		Datum d = new Datum(2, "qwe1234@gamil.com", "aanand", "kanan", "bvcxwert1234");
		Datum d1 = new Datum(12, "gfde1234@gamil.com", "nanda", "balan", "bvcxwert1234");
		Datum d2 = new Datum(3, "wsde1234@gamil.com", "mukund", "krisnan", "bvcxwert1234");
		Datum d3 = new Datum(4, "vcdde1234@gamil.com", "deva", "raman", "bvcxwert1234");
		
		data.add(d);
		data.add(d1);
		data.add(d2);
		data.add(d3);
		
		Employee e = new Employee(1, 2, 12, 124, data, sup);
		map.writeValue(file, e);
	}

}
