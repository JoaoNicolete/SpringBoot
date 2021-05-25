package br.org.generation.hello.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotação que indica ser um Controller
public class HelloController {
	
	@GetMapping("/hello") // só funciona logo em cima de um método
	public String sayHello(){
		return "Hello Turma 23";
	}
	

}
