package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView helloPage() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi User,Welcome to Spring World");
		return model;

	}
	
	@RequestMapping("/hi")
	public ModelAndView helloPage1() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi User,Welcome to Spring World seenu");
		return model;

	}

}
