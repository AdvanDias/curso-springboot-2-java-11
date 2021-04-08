package com.cursoudemy.springboot.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoudemy.springboot.entidades.Usuario;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "AdvanDias", "advandias@emial.com", "888888800", "123456");
		return ResponseEntity.ok().body(u);
	}
}
