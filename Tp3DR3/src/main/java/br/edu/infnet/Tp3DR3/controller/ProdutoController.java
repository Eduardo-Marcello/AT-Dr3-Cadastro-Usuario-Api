package br.edu.infnet.Tp3DR3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.service.ProdutoService;


@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService= produtoService;
	}
	
	@GetMapping(value = "produto/cadastroProduto")
	public String telaCadastro(Model model) {
		Produto produto = new Produto();
		 model.addAttribute("produto", produto);
		return "produto/cadastroProduto";
	}
	
	@PostMapping(value = "/registraProduto")
	public String registra(Model model, Produto produto) {
		
		produtoService.registra(produto);
		return "redirect:/produto/lista";
		
	}
	
	@GetMapping(value = "/produto/lista")
	public String listagem(Model model) {
		
		model.addAttribute("produtos", produtoService.findListagem());
		return "produto/lista";
	}
	
	@GetMapping(value = "/produto/listaCotacoes")
	public String listagemCotacoes(Model model) {
		
		model.addAttribute("produtos", produtoService.findCotacoes());
		return "produto/listaCotacoes";
	}
	
	@GetMapping(value = "produto/excluir")
	public String excluir(@RequestParam Integer id, Model model) {
		
		produtoService.excluir(id);
		return "redirect:/produto/lista";
	}
	
	@GetMapping("/produto/alterar")
    public ModelAndView alterar(@RequestParam Integer id) {
        
        ModelAndView mav = new ModelAndView("/produto/alterar");
        Produto produto = produtoService.findById(id);
        mav.addObject("produto", produto);
        return mav;
    }
    
    @PostMapping(value = "/produto/salvarproduto")
    public String salvarProduto(@ModelAttribute("produto") Produto produto) {
    	produtoService.registra(produto);
        return "redirect:/produto/lista";
    }

	
}
