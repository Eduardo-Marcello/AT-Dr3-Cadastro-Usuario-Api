package br.edu.infnet.Tp3DR3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.Tp3DR3.model.negocio.Cotacao;
import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.service.CotacaoService;
import br.edu.infnet.Tp3DR3.service.ProdutoService;


@Controller
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
	
	@GetMapping(value = "/cotacao/cadastroCotacao")
	public String telaCadastro(Model model) {
		Cotacao cotacao = new Cotacao();
		
		 model.addAttribute("cotacao", cotacao);
		 model.addAttribute("produtos", produtoService.findListagem());
		return "cotacao/cadastroCotacao";
	}
	
	@PostMapping(value = "/registraCotacao")
	public String registra(Cotacao cotacao, Produto produto) {
		
		cotacaoService.registra(cotacao, produto);
		return "redirect:/cotacao/lista";
	}
	
	@GetMapping(value = "/cotacao/lista")
	public String listagem(Model model) {
		
		model.addAttribute("cotacoes", cotacaoService.findListagem());
		return "cotacao/lista";
	}
	
	@GetMapping(value = "/cotacao/{id}/excluir")
	public String excluir(@PathVariable Integer id, Model model) {
		
		cotacaoService.excluir(id);
		return "redirect:/cotacao/lista";
	}
}
