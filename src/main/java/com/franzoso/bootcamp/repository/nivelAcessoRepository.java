package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface nivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

	
}
