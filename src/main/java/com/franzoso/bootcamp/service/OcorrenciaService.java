package com.franzoso.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franzoso.bootcamp.model.Ocorrencia;
import com.franzoso.bootcamp.repository.OcorrenciaRepository;

// REGRA DE NEG�CIO

@Service
public class OcorrenciaService {

	@Autowired
	OcorrenciaRepository ocorrenciaRepository;

	public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);

	}

	public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);

	}
	
	public List<Ocorrencia> findAll() {
		return ocorrenciaRepository.findAll();
	}

	public Optional<Ocorrencia> findByID(Long id) {
		return ocorrenciaRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		ocorrenciaRepository.deleteById(id);
	}
}
