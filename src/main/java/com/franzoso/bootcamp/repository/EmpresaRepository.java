package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	
}
