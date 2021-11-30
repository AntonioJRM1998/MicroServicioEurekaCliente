package com.example.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(path="/")
	public String prueba() {
		return ("Hola mundo");
	}
}
