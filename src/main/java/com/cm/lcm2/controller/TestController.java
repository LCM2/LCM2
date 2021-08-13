package com.cm.lcm2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	  @GetMapping("/chart")
	  public String chart() {
	    return "chart";
	  }
	  @GetMapping("/empty")
	  public String empty() {
		  return "empty";
	  }
	  @GetMapping("/form")
	  public String form() {
		  return "form";
	  }
	  @GetMapping("/index")
	  public String index() {
		  return "index";
	  }
	  @GetMapping("/table")
	  public String table() {
		  return "table";
	  }
}
