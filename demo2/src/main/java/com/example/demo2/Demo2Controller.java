package com.example.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
	Logger logger = LoggerFactory.getLogger(Demo2Controller.class);

	@GetMapping("/app2")
	public String sayHello() {
		String sayHello1 = "welcome in demp application-2";
		logger.info(sayHello1);
		return sayHello1;
	}

}
