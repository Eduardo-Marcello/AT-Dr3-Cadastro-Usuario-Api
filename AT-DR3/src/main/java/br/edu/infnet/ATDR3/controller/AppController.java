package br.edu.infnet.ATDR3.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.ATDR3.model.negocio.Usuario;
import br.edu.infnet.ATDR3.service.UsuarioService;


@RestController
@RequestMapping("api/atdr3")
public class AppController {
	@Autowired
	private UsuarioService usuarioService;
    
    @PostMapping(value = "/usuario/cadastrar")
    public Usuario cadastrar(Usuario usuario) throws SQLException {
   
        return usuarioService.salvar(usuario);
    }
    
    @PostMapping(value = "/usuario/validacao")
    public Usuario validacao(@RequestParam String email, @RequestParam String password)throws SQLException {
    	
    	return usuarioService.acharCadastro(email, password);
    }
    
    @GetMapping(value = "/usuario/lista")
    public List<Usuario> listagem(){
    	
    	return usuarioService.acharListagem();
    }
    
    @PutMapping(value = "/usuario/alterar")
    public Usuario alterarUsuario(Integer id, String email, String nome, String password) {
    	
    	if(email != null) {
    		usuarioService.alteraEmail(id, email);
    	} 
    	
    	if(nome != null) {
    		usuarioService.alteraNome(id, nome);
    	} 
    	
    	if(password != null) {
    		usuarioService.alteraSenha(id, password);
    	}
    	
    	return usuarioService.consultarPorID(id);
    }
    
    @DeleteMapping(value = "/usuario/deleta")
    public void excluirUsuario(Integer id){
    	
    	usuarioService.deletaUsuario(id);
    }
 
}