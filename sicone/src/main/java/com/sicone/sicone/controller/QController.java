package com.sicone.sicone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QController {
	
	@RequestMapping("/goy")
	public String goy() {
		return "Uilin, chega cedo";
	}

}
