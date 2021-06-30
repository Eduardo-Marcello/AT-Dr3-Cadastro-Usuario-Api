package br.edu.infnet.Tp3DR3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.Tp3DR3.model.negocio.Login;
import br.edu.infnet.Tp3DR3.model.negocio.Usuario;
import br.edu.infnet.Tp3DR3.model.repository.IUsuarioRepository;


@Service
public class UsuarioService {
	@Autowired
	private IUsuarioRepository usuarioRepository;
	Usuario usuario = new Usuario();
	Login login = new Login();
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void salvar(Usuario usuario)
	{
		usuarioRepository.save(usuario);
		this.usuario = usuario;
	}
	
	public void salvarLogin(Login login)
	{
		this.login = login;
	}
	
	public Usuario consultarCadastro() {
		return usuario;
	}
	public Usuario consultarPorID(Integer id)
	{
		return usuarioRepository.findById(id).get();
	}
	
	public void excluir(Integer id) 
	{
		usuarioRepository.deleteById(id);
	}
	
	public boolean acharCadastro() {
		usuarios = (List<Usuario>) usuarioRepository.findAll();

		for(Usuario us: usuarios) {
			if(login.getEmail().equalsIgnoreCase(us.getEmail())) {
				if(login.getPassword().equalsIgnoreCase(us.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}
	
	// Outro estilo para à autenticação
	
//	for(Usuario us: usuarios) {
//		if((login.getEmail().equalsIgnoreCase(us.getEmail())) && (login.getPassword().equalsIgnoreCase(us.getPassword()))) {
//				return true;
//			}
//		}
//
//	return false;
//}
	
}
