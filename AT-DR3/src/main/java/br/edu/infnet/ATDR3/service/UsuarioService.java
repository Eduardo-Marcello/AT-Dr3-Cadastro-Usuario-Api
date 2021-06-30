package br.edu.infnet.ATDR3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.ATDR3.model.negocio.Usuario;
import br.edu.infnet.ATDR3.model.repository.IUsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	Usuario usuario = new Usuario();
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Usuario salvar(Usuario usuario)
	{
		return this.usuarioRepository.save(usuario);
	}
	
	public Usuario consultarCadastro() {
		return usuario;
	}
	
	public Usuario consultarPorID(Integer id)
	{
		return usuarioRepository.findById(id).get();
	}
	
	public List<Usuario> acharListagem() {
		
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public void deletaUsuario(Integer id) 
	{
		usuarioRepository.deleteById(id);
	}
	
	public void alteraEmail(Integer id, String email) {
		usuario = consultarPorID(id);
		usuario.setEmail(email);
		usuarioRepository.save(usuario);
	}
	
	public void alteraNome(Integer id, String nome) {
		usuario = consultarPorID(id);
		usuario.setName(nome);
		usuarioRepository.save(usuario);
	}
	
	public void alteraSenha(Integer id, String password) {
		usuario = consultarPorID(id);
		usuario.setPassword(password);
		usuarioRepository.save(usuario);
	}
	
	public Usuario acharCadastro( String email,  String password) {
		usuarios = (List<Usuario>) usuarioRepository.findAll();

		for(Usuario us: usuarios) {
			if(email.equalsIgnoreCase(us.getEmail())) {
				if(password.equalsIgnoreCase(us.getPassword())) {
					return us;
				}
			}
		}
		return null;
	}
	
	// Outro estilo para à autenticação
	
//	for(Usuario us: usuarios) {
//		if((email.equalsIgnoreCase(us.getEmail())) && (password.equalsIgnoreCase(us.getPassword()))) {
//				return us;
//			}
//		}
//
//	return null;
//}
	
}
