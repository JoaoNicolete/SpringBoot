package br.org.habilidades.blogpessoal.modelteste;



import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.habilidades.blogpessoal.model.Postagem;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PostagemTeste {
	
	public Postagem postagem;
	
	@Autowired
	private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	
	@BeforeEach
	public void start() {
		postagem = new Postagem((Long) null, "titulo", "texto",null, null);
	}
	
	@Test
	public void testValidationAtributos() {
		postagem.setTitulo("Desgrama");
		postagem.setTexto("Não aguento mais");
	}
	
	
}
