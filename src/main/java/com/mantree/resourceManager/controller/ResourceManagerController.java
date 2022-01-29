package com.mantree.resourceManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/resource-manager")
public class ResourceManagerController {

	
	@GetMapping ("/test")
	private String check() {
		return "working";
	}
}
