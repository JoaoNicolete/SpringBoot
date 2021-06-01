package br.org.generation.gaymes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.org.generation.gaymes.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase( String descricao );
}
