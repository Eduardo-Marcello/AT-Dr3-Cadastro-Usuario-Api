package br.edu.infnet.Tp3DR3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.service.ProdutoService;


@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService= produtoService;
	}
	
	@PostMapping("/registraProduto")
	public Produto registra(int codigoProduto, String nomeProduto, String classificacao) {
		return produtoService.registra(codigoProduto,nomeProduto,classificacao);
	}
	
	@PostMapping("/ListaCotacoes")
	public List<Produto> listagemCotacoes(){
		
		return produtoService.findListagem();
	}
	
	@DeleteMapping(value = "/deletaProduto/{id}")
	public void excluir(@PathVariable Short id) {
		produtoService.excluir(id);	
	}
	
}
