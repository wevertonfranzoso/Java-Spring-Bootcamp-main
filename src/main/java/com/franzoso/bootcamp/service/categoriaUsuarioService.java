package com.franzoso.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franzoso.bootcamp.model.CategoriaUsuario;
import com.franzoso.bootcamp.repository.categoriaUsuarioRepository;

// REGRA DE NEG�CIO

@Service
public class categoriaUsuarioService {

	@Autowired
	categoriaUsuarioRepository categoriaUsuario;

	public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoria) {
		return categoriaUsuario.save(categoria);

	}

	public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoria) {
		return categoriaUsuario.save(categoria);

	}
	
	public List<CategoriaUsuario> findAll() {
		return categoriaUsuario.findAll();
	}

	public Optional<CategoriaUsuario> findByID(Long id) {
		return categoriaUsuario.findById(id);
	}
	
	public void DeleteByID(Long id) {
		categoriaUsuario.deleteById(id);
	}
}
