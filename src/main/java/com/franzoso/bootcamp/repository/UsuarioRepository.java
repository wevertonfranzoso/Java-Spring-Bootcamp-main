package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
}
