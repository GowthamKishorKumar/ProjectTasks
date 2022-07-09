package com.pojo;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\god\\eclipse-workspace\\MavenTasks\\JArray.json");
	ObjectMapper map = new ObjectMapper();
	POJO value = map.readValue(file, POJO.class);
	System.out.println(value.getPage());
	System.out.println(value.getPer_page());
	System.out.println(value.getTotal());
	System.out.println(value.getTotal_pages());
	
	ArrayList<Datum> data = value.getData();
	for (Datum d : data) {
		System.out.println(d.getFirst_name());
		System.out.println(d.getLast_name());
		System.out.println(d.getEmail());
		System.out.println(d.getId());
		System.out.println(d.getAvatar());}
	Support support = value.getSupport();
	System.out.println(support.getUrl());
	System.out.println(support.getText());
	
	}

}
