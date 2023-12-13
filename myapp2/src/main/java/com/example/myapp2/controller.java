package com.example.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello";
	}
	@GetMapping("hello2")
	public String hello2() {
		
		return "hello2";
	}
	
}
