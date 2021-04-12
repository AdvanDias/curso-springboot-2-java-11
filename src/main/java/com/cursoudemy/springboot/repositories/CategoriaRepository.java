package com.cursoudemy.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.springboot.entidades.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
