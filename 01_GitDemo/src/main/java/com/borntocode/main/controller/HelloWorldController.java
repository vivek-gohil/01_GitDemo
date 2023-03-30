package com.borntocode.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gitapi")
public class HelloWorldController {

	@RequestMapping("message")
	public String getMessage() {
		return "This message is printed by Vivek Gohil";
	}

	@RequestMapping("newmessage")
	public String printMessage() {
		return "This message is printeed by Trupti";
	}
}
