package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

	
}
