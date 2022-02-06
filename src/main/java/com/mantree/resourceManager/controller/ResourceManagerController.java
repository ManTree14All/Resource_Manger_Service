package com.mantree.resourceManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantree.resourceManager.entity.Countries;
import com.mantree.resourceManager.repo.CountriesRepo;


@RestController
@RequestMapping("/resource-manager")
public class ResourceManagerController {
	
	@Autowired
	private CountriesRepo repo;
	

	
	@GetMapping ("/test")
	private String check() {
		repo.findAll().forEach(System.out::println);
		return "working now!";
	}
}
