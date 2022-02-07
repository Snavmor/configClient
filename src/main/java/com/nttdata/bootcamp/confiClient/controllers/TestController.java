package com.nttdata.bootcamp.confiClient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${some.value}")
	private String valor;
	
	@GetMapping("/valor")
	public String valor() {
		System.out.println("Hola mundo");
		return this.valor;
	}

}
