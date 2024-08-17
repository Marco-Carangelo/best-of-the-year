package org.lesson.java.spirng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class PageController {
	
	  @GetMapping("/home")
	  public String home(Model model) {
		  String name = "Marco Carangelo";
		  
		  model.addAttribute("name", name);
		  
		return "home";
		  
		  
	  }
	  

}
