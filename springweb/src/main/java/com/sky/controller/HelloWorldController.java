package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld() {
		
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("hello","message",message);
	}
}
