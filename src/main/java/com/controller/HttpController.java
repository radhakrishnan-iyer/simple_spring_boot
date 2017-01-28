package com.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

	@RequestMapping(value="/hi")
	@ResponseBody
	public String hi(){
		return "Welcome to spring boot";
	}
}
