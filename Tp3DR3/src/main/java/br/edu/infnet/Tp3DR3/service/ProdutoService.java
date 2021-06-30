package br.edu.infnet.Tp3DR3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.Tp3DR3.model.negocio.Produto;
import br.edu.infnet.Tp3DR3.model.repository.IProdutoRepository;


@Service
public class ProdutoService {
	
		@Autowired
		private IProdutoRepository pr;
		
		public ProdutoService(IProdutoRepository pr) {
	        this.pr = pr;
	    }
		
		public Produto registra(Produto produto) {
			return this.pr.save(produto);
		}
		
		public Produto findByKeyword(String keyword) {
			return pr.search(keyword);
		}
		
		public List<Produto> findListagem(){
			return pr.findAll();
		}
		
		public List<Produto> findCotacoes(){
			return pr.findCotacoes();
		}
		
		public Integer findIdByKeyword(String keyword) {
			return pr.search(keyword).getIdProduto();
		}
		
		public void excluir(Integer id) {
			this.pr.deleteById(id);
		}
		
}
