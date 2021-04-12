package com.cursoudemy.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursoudemy.springboot.entidades.Categoria;
import com.cursoudemy.springboot.entidades.Ordem;
import com.cursoudemy.springboot.entidades.Produto;
import com.cursoudemy.springboot.entidades.Usuario;
import com.cursoudemy.springboot.entidades.enums.OrdemStatus;
import com.cursoudemy.springboot.repositories.CategoriaRepository;
import com.cursoudemy.springboot.repositories.OrdemRepository;
import com.cursoudemy.springboot.repositories.ProdutoRepository;
import com.cursoudemy.springboot.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private OrdemRepository ordemRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		Produto p1 = new Produto(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto p5 = new Produto(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategorias().add(cat2);
		p2.getCategorias().add(cat1);
		p2.getCategorias().add(cat3);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat3);
		p5.getCategorias().add(cat2);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		Usuario u1 = new Usuario(null, "Bambam", "bambam@email.com", "5555555", "321");
		Usuario u2 = new Usuario(null, "Silva", "Silva@email.com", "77777770000", "8564");
		
		Ordem o1 = new Ordem(null, Instant.parse("2020-04-20T19:53:07Z"), OrdemStatus.AGUARDANDO_PAGAMENTO, u1);
		Ordem o2 = new Ordem(null, Instant.parse("2020-03-21T03:42:10Z"), OrdemStatus.ENTREGUE, u2);
		Ordem o3 = new Ordem(null, Instant.parse("2020-02-22T15:21:22Z"), OrdemStatus.ENTREGUE, u1);
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		ordemRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
