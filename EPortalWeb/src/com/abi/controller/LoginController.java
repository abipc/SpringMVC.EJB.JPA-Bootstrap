package com.abi.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope("session")
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginPage() {
		
		return "loginPage";
	}

}
