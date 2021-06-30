package br.edu.infnet.Tp3DR3.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.Tp3DR3.model.negocio.Cotacao;
import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.model.repository.ICotacaoRepository;

@Service
public class CotacaoService {
	
	@Autowired
	private ICotacaoRepository cr;
	@Autowired
	ProdutoService ps;
	
	
	public CotacaoService(ICotacaoRepository cr) {
        this.cr = cr;
    }
	
	public void registra(Cotacao cotacao, Produto produto) {
		
		Set<Cotacao> cotacoes = new HashSet<>();
		cotacoes.add(cotacao);
		produto.setCotacoes(cotacoes);
		this.cr.save(cotacao);
	}
	
	public List<Cotacao> findListagem(){
		return cr.findAll();
	}
	
	public void excluir(Integer id) {
		this.cr.deleteById(id);
	}

	public List<Cotacao> findCotacoes(String keyword) {
		List<Cotacao> cotacoes = new ArrayList<Cotacao>();
		List<Cotacao> c = cr.findAll();
		for(Cotacao cos: c) {
			if(cos.getProduto().getIdProduto() == ps.findIdByKeyword(keyword)) {
				cotacoes.add(cos) ;
			}
		}
		return cotacoes;
	}
	
}
