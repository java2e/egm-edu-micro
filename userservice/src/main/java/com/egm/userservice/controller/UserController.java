package com.egm.userservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


	@GetMapping("/check")
	public String check() {
		return "Working on port "+environment.getProperty("local.server.port");
	}

	@Autowired
	private Environment environment;

	@GetMapping("/check2")
	public String check2() {

		return "Working on port "+environment.getProperty("local.server.port");
	}

}
