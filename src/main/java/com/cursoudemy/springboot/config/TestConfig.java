package com.cursoudemy.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoudemy.springboot.entidades.Usuario;
import com.cursoudemy.springboot.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Bambam", "bambam@email.com", "5555555", "321");
		Usuario u2 = new Usuario(null, "Silva", "Silva@email.com", "77777770000", "8564");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
