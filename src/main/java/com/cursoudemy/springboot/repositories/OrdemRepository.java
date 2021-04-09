package com.cursoudemy.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.springboot.entidades.Ordem;

public interface OrdemRepository extends JpaRepository<Ordem, Long>{

}
