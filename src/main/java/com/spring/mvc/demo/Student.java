package com.spring.mvc.demo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	public String color;
	
	LinkedHashMap<String, String> colorOptions;
	
	public Student() {
		colorOptions = new LinkedHashMap<>();
		colorOptions.put("red color", "red");
		colorOptions.put("blue color", "blue");
		colorOptions.put("black color", "black");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LinkedHashMap<String, String> getColorOptions() {
		return colorOptions;
	}
	
	
	
	
	
	
	

}
