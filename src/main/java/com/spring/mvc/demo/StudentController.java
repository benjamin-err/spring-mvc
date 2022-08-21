package com.spring.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {
		
		// create new Student obj
		Student student = new Student();
	
		// add student obj as an attribute "student" to the model
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student aStudent) {
		
		System.out.println("Student: " + aStudent.getFirstName() + " " + aStudent.getLastName());
		
		return "student-confirmation";
	}
	
	

}
