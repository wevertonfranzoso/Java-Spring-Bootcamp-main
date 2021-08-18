package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface bancoHorasRepository extends JpaRepository<BancoHoras, Long> {

	
}
