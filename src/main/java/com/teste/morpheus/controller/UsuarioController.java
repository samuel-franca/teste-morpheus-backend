package com.teste.morpheus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.morpheus.model.Usuario;
import com.teste.morpheus.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/cadastro")
	public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@GetMapping("/lista")
	public List<Usuario> listarUsuarios(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/busca")
	public List<Usuario> buscarPorNome(@RequestBody String nome) {
		return usuarioService.findByName(nome);
	}

}
