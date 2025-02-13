package com.unicap.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/message")
public class MsgController {
	
	@GetMapping
	public String welcomeMsg() {
		return "Olá, essa é uma aplicação java com docker!";
	}
	
}
