package com.franzoso.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franzoso.bootcamp.model.NivelAcesso;
import com.franzoso.bootcamp.repository.nivelAcessoRepository;

// REGRA DE NEG�CIO

@Service
public class nivelAcessoService {

	@Autowired
	nivelAcessoRepository nivelAcessoRepository;

	public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso) {
		return nivelAcessoRepository.save(nivelAcesso);

	}

	public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso) {
		return nivelAcessoRepository.save(nivelAcesso);

	}
	
	public List<NivelAcesso> findAll() {
		return nivelAcessoRepository.findAll();
	}

	public Optional<NivelAcesso> findByID(Long id) {
		return nivelAcessoRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		nivelAcessoRepository.deleteById(id);
	}
}
