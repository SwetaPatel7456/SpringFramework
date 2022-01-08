package com.practice.Controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {
	
	@GetMapping(value = "/about")
	public String about(Model m) {
		
		m.addAttribute("name", "Sweta Patel");
		m.addAttribute("currentValue", new Date());		
		
		System.out.println("mmm");
		
		return "about";
	}
	
	@GetMapping(value = "/iterator")
	public String iteratorHandler(Model m) {
		
		List<String> li = List.of("Sweta","Eva","Rishika");
		
		return "iterator";
	}
	@GetMapping(value = "/condition")
	public String conditionHandler(Model m) {
		
		m.addAttribute("isActive", true);
		m.addAttribute("Gender", 'F');
		List<String> li = List.of("Sweta","Eva","Rishika");
		return "condition";
	}
	@GetMapping(value = "/service")
	public String serviceHandler(Model m) {
		
		m.addAttribute("title", "I like to eat samosa");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		
		return "service";
	}

	@GetMapping(value = "/newabout")
	public String newabout() {
		
		return "aboutNew";
	}


}
