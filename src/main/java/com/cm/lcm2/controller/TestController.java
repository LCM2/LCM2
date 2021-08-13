package com.cm.lcm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	  @GetMapping("/chart")
	  public String chart(Model model){
	        model.addAttribute("data","chart!!");
	        return "chart";
	  }
	  @GetMapping("/empty")
	  public String empty(Model model){
	        model.addAttribute("data","empty!!");
	        return "empty";
	  }
	  @GetMapping("/form")
	  public String form(Model model){
	        model.addAttribute("data","form!!");
	        return "form";
	  }
	  @GetMapping("/index")
	  public String index(Model model){
	        model.addAttribute("data","index!!");
	        return "index";
	  }
	  @GetMapping("/table")
	  public String table(Model model){
	        model.addAttribute("data","table!!");
	        return "table";
	  }
}
