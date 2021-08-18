package com.franzoso.bootcamp.repository;

import com.franzoso.bootcamp.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface tipoDataRepository extends JpaRepository<TipoData, Long> {

	
}
