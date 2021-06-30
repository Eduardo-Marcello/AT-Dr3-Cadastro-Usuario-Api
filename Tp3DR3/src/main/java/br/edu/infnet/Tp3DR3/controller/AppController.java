package br.edu.infnet.Tp3DR3.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.infnet.Tp3DR3.model.negocio.Login;
import br.edu.infnet.Tp3DR3.model.negocio.Usuario;
import br.edu.infnet.Tp3DR3.service.UsuarioService;


@Controller
public class AppController {
	@Autowired
	private UsuarioService usuarioService;
	
    @RequestMapping(value = "/usuario/cadastro")
    public String cadastro(Model model) 
    {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "usuario/cadastro";
    }
    
    @RequestMapping(value = "/cadastrar")
    public String cadastrar(Model model, Usuario usuario) throws SQLException {
    	usuarioService.salvar(usuario);
        return "redirect:/confirmacao";
    }
    
    @RequestMapping(value = "/confirmacao")
    public String confirmacao(Model model) {
    	model.addAttribute("usuario", usuarioService.consultarCadastro());
        return "confirmacao";
    }
    
    @RequestMapping(value = "/login")
    public String login(Model model){
    	Login login = new Login();
    	 model.addAttribute("login", login);
    	return "login";
    }
    
    @RequestMapping(value = "/validacao")
    public String validacao(Model model, Login login)throws SQLException {
    	usuarioService.salvarLogin(login);
    	return "redirect:/valida";
    }
    
    @RequestMapping(value = "/valida")
    public String valida(Model model) {
    	String msg;
    	if(usuarioService.acharCadastro()==true) {
    			msg = "Você está autenticado no sistema!";
    		} else {
    			msg = "Dados incorretos ou inexistentes!";
    		}

    	model.addAttribute("msg", msg);
        return "valida";
    }

    
}