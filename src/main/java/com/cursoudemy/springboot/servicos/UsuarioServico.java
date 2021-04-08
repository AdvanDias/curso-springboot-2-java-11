package com.cursoudemy.springboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.springboot.entidades.Usuario;
import com.cursoudemy.springboot.repositories.UsuarioRepository;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepository repositoryUsuario;
	
	public List<Usuario> RetornaTodos(){
		return repositoryUsuario.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repositoryUsuario.findById(id);
		return obj.get();
	}
}
