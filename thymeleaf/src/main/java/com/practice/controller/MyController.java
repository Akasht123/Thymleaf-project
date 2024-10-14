package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.Model;

@Controller
public class MyController {
	@RequestMapping(value="/about" ,method=RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name","Akash");
		return "about";
	}
	@RequestMapping(value="/form" ,method=RequestMethod.GET)
	public String openForm() {
		System.out.println("form");
		return "form";
	}
}
