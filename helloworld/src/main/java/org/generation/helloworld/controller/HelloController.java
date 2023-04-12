package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o codigo abaixo vai ser o controller, ou um controller da nossa API
@RestController
// usado para indicar qual URL ou URI deve acionar um determinado método no controlador.
//indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloController {
	//localhost:8080/hello
	@GetMapping
	public String hello() {
		return "Alo mundão";
	}
	//localhost:8080/hello/bsm
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação com meu grupo";
	}
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Aprender Spring";
	}
	
}
