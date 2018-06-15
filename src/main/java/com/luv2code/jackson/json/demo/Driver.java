package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO: 
			// data/sample-full.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print student
			System.out.println(theStudent);
		} catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
