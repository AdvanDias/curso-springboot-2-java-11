package com.cursoudemy.springboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.springboot.entidades.Categoria;
import com.cursoudemy.springboot.repositories.CategoriaRepository;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaRepository repositoryCategoria;
	
	public List<Categoria> RetornaTodos(){
		return repositoryCategoria.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repositoryCategoria.findById(id);
		return obj.get();
	}
}
