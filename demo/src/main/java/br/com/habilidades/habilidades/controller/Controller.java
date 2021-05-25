package br.com.habilidades.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/habilidades")
	public String sayHello(){
		return "Persistência e atenção ao detalhe";
	}
	
	@GetMapping("/teste")
	public String objetivos(){
		return "Entender Spring boot";
	}

}
