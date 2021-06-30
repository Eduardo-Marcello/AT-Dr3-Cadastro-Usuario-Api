package br.edu.infnet.Tp3DR3.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.Tp3DR3.model.negocio.Cotacao;


@Repository
public interface ICotacaoRepository extends JpaRepository<Cotacao, Short> {
	
}
