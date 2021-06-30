package br.edu.infnet.Tp3DR3.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.infnet.Tp3DR3.model.negocio.Produto;


public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
	@Query(value = "SELECT p FROM Produto p WHERE p.nomeProduto LIKE '%' || :keyword || '%'")
    public Produto search(@Param("keyword") String keyword);
	public List<Produto> findCotacoes();

}
