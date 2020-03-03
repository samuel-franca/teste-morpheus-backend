package com.teste.morpheus.service;

import java.util.List;

import com.teste.morpheus.model.Usuario;

public interface UsuarioService {

    Usuario save(Usuario usuario);	
    
    List<Usuario> findAll();

	void delete(String id);

}
