package com.cursoudemy.springboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoudemy.springboot.entidades.Produto;
import com.cursoudemy.springboot.repositories.ProdutoRepository;

@Service
public class ProdutoServico {

	@Autowired
	private ProdutoRepository repositoryProduto;
	
	public List<Produto> RetornaTodos(){
		return repositoryProduto.findAll();
	}
	
	public Produto findById(Long id) {
		Optional<Produto> obj = repositoryProduto.findById(id);
		return obj.get();
	}
}
