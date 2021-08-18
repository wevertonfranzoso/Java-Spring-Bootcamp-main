package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface jornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

	
}
