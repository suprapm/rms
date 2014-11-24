package com.programcreek.helloworld.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springgreetings/home")
public class HelloWorldController {

	String message = "Welcome to Spring MVC!";
	protected static Logger logger = Logger.getLogger("HelloWorldController");



	@RequestMapping(value = "greetings.html", method = RequestMethod.GET)
	public String showAddGreetingPage() {		

		logger.info("entering showAddGreetingPage()");
		System.out.println("GAurav!!WelDone ");
		//no need to add colorlist to the model anymore since it is defined at method level below
		//no need to have the model object in this method either
		System.err.println("i am in controller");
		//resolves to /WEB-INF/jsp/addgreeting.jsp
		return "greetings";
	}	




}
