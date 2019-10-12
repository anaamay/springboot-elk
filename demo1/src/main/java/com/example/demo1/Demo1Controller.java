package com.example.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class Demo1Controller {
	Logger logger = LoggerFactory.getLogger(Demo1Controller.class);

	@GetMapping("/app1")
	public String sayHello() {
		String sayHello1 = "welcome in demp application-1";
		logger.info(sayHello1);
		return sayHello1;
	}

}
