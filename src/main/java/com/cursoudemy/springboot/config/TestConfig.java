package com.cursoudemy.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoudemy.springboot.entidades.Ordem;
import com.cursoudemy.springboot.entidades.Usuario;
import com.cursoudemy.springboot.entidades.enums.OrdemStatus;
import com.cursoudemy.springboot.repositories.OrdemRepository;
import com.cursoudemy.springboot.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private OrdemRepository ordemRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Bambam", "bambam@email.com", "5555555", "321");
		Usuario u2 = new Usuario(null, "Silva", "Silva@email.com", "77777770000", "8564");
		
		Ordem o1 = new Ordem(null, Instant.parse("2020-04-20T19:53:07Z"), OrdemStatus.AGUARDANDO_PAGAMENTO, u1);
		Ordem o2 = new Ordem(null, Instant.parse("2020-03-21T03:42:10Z"), OrdemStatus.ENTREGUE, u2);
		Ordem o3 = new Ordem(null, Instant.parse("2020-02-22T15:21:22Z"), OrdemStatus.ENTREGUE, u1);
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		ordemRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
