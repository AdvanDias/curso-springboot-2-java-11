package com.cursoudemy.springboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.springboot.entidades.Ordem;
import com.cursoudemy.springboot.repositories.OrdemRepository;


@Service
public class OrdemServico {

	@Autowired
	private OrdemRepository repositoryordem;
	
	public List<Ordem> RetornaTodos(){
		return repositoryordem.findAll();
	}
	
	public Ordem findById(Long id) {
		Optional<Ordem> obj = repositoryordem.findById(id);
		return obj.get();
	}
}
