package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class ClearController {
	
	@GetMapping(value = "/new-char/04_clear")
	public String clearSession(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "new-char/04_clear";
	}

}
