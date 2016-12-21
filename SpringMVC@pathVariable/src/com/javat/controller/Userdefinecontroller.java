package com.javat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Userdefinecontroller {
		
	@RequestMapping("/firstmvc/{username}/{password}") //firstmvc is the name of form action 
	protected ModelAndView springBasic(@PathVariable("username") String name , @PathVariable("password") String pass) throws Exception {
		
		ModelAndView obj=new ModelAndView("welcome"); 
		// welcome is the name of view(jsp file)
		 
		obj.addObject("javat","welcome to spring mvc\n"+"your username is -"+name+" /"+"password -"+pass); 
		// javat is the object holding value welcome to.....
		
		
		return obj;
	}
}


