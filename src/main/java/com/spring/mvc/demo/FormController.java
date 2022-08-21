package com.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class FormController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String result = "Yo!!! " + request.getParameter("studentName").toUpperCase();
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	/*
	 * Using the RequestParam("studentName") Spring reads the html input form named studentName
	 * and populates the variable theName with the value typed in the input form effectively doing 
	 * the same as the previous method but easier.
	 * */
	@RequestMapping("processFormV3")
	public String processFormVersion3(@RequestParam("studentName") String theName, Model model) {
		String result = "Hey " + theName.toUpperCase() + ", how are you?";
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
