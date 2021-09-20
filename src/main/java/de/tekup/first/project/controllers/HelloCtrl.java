package de.tekup.first.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.services.HelloService;

@RestController
public class HelloCtrl {

	private HelloService service;
	
	
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	@RequestMapping(path = "/hello")
	public String sayHello() {
		return service.getHelloWorld();
	}
	
	@RequestMapping(path = "/hello/{value}")
	public String sayHello(@PathVariable("value") String name) {
		return service.getHelloName(name);
	}


	
}
