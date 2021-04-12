package com.cursoudemy.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.springboot.entidades.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
