package de.tekup.first.project.services;

import org.springframework.stereotype.Service;
@Service
public class HelloService {
	
	public String getHelloWorld() {
		return "Hello Worlds!";
	}
	
	public String getHelloName(String name) {
		return "Hello "+name+"!";
	}

}
