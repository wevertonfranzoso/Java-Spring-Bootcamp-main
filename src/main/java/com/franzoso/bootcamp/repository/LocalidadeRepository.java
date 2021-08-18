package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

	
}
