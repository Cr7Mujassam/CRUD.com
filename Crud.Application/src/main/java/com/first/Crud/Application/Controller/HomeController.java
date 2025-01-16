package com.first.Crud.Application.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	//sending home page
	public String crudHomePage() {
		return "crudHome";
	}
}
