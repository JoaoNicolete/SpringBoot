package br.org.habilidades.blogpessoal.repositoryteste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.habilidades.blogpessoal.model.Postagem;
import br.org.habilidades.blogpessoal.repository.PostagemRepository;


@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PostagemRepositoryTeste {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@BeforeAll
	public void start() {
		Postagem postagem = new Postagem((Long) null, "titulo", "texto",null, null);
		if (postagemRepository.findAllByTituloContainingIgnoreCase(postagem.getTitulo() == null))
			postagemRepository.save(postagem);
		
		postagem = new Postagem((Long) null, "titulo", "não aguento mais",null, null);
		if (postagemRepository.findAllByTituloContainingIgnoreCase(postagem.getTitulo() == null))
			postagemRepository.save(postagem);
		
	}
	
	@Test
	public void findByIdRetornaTitulo() throws Exception {
		Optional<Postagem> postagem = postagemRepository.findById((long) 1);
		assertTrue(postagem.get().getTitulo().equals("Titulo"));
		
	}
	
	@AfterAll
	public void end() {
		postagemRepository.deleteAll();
	}
	

}
