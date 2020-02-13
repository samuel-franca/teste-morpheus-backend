package com.teste.morpheus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teste.morpheus.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	@Query(value = "select * from tb_usuario where nome like concat('%',?1,'%')", nativeQuery = true)
	public List<Usuario> findByNome(String nome);

}