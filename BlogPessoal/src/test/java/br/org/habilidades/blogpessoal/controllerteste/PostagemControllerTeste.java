package br.org.habilidades.blogpessoal.controllerteste;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import br.org.habilidades.blogpessoal.model.Postagem;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PostagemControllerTeste {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Postagem postagem;
	private Postagem postagemupd;
	
	@BeforeAll
	public void start()	{
		postagem = new Postagem((Long) null, "titulo", "texto",null, null);
		postagemupd = new Postagem(2L, "socorro", "meu deos do ceu",null, null);
	}
	
}
