package com.teste.morpheus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.morpheus.model.Usuario;
import com.teste.morpheus.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;

	@PostMapping("/cadastro")
	public Usuario cadastrarUsuario(@RequestBody @Valid Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@GetMapping("/lista")
	public List<Usuario> listarUsuarios(){
		return usuarioService.findAll();
	}
	
	@DeleteMapping("/deletar")
	public void deletarUsuario(@RequestBody String id) {
		usuarioService.delete(id);
	}

}
