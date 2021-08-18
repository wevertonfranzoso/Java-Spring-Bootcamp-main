package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

	
}
