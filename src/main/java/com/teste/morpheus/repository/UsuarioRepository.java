package com.teste.morpheus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teste.morpheus.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}