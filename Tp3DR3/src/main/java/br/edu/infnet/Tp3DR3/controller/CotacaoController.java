package br.edu.infnet.Tp3DR3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.Tp3DR3.model.negocio.Cotacao;
import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.service.CotacaoService;
import br.edu.infnet.Tp3DR3.service.ProdutoService;


@RestController
public class CotacaoController {
	
	@Autowired
	private CotacaoService cotacaoService;
	
	@Autowired
	private ProdutoService produtoService;
	Produto produto = new Produto();

	@Autowired
	public CotacaoController(CotacaoService cotacaoService) {
		this.cotacaoService = cotacaoService;
	}
	
	@PostMapping("/registraCotacao")
	Cotacao registra(Double preco, String keyword) {
		return cotacaoService.registra(preco, produto);
	}
	
	@PostMapping("/ListCotacoes")
	public List<Cotacao> findList(String keyword) {
//		List<Cotacao> c = cotacaoService.findCotacoes(keyword);
//		System.out.println(c);
		return cotacaoService.findCotacoes(keyword);
	}
	
	@DeleteMapping(value = "/deletaCotacao/{id}")
	public void excluir(@PathVariable Short id) {
		cotacaoService.excluir(id);	
	}
}
