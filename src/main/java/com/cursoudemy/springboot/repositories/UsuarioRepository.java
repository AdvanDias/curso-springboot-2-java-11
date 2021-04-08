package com.cursoudemy.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.springboot.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
