package com.test.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	static Logger logger = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadHomePage(){
		System.out.println("executing loadHomePage");
		logger.info("executing loadHomePage method");
		return "home";
	}
	
	
//	@RequestMapping(value="/hi", method=RequestMethod.GET)
//	public String loadHiPage(){
//		return "hi";
//	}
	
}















































