package edu.actuator.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.actuator.model.Greeting;

@RestController
public class ActuatorController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/hello-actuator", method = RequestMethod.GET)
	@ResponseBody
	public Greeting sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		System.err.println("tesst");
		System.err.println("tesst");
		System.err.println("tesst");
		System.err.println("tesst");

		//branch 'master' of https://github.com/phamvanoanh/jenkin-demo.git
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
