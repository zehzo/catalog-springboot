package com.api.catalog.catalogspringboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.catalog.catalogspringboot.dtos.CategoriaDto;
import com.api.catalog.catalogspringboot.entidades.Categoria;
import com.api.catalog.catalogspringboot.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaRepositorio repositorio;

	@Transactional(readOnly = true)
	public List<CategoriaDto> findAll() {
		List<Categoria> lista = repositorio.findAll();

		return lista.stream().map(x -> new CategoriaDto(x)).toList();
	}

	@Transactional(readOnly = true)
	public CategoriaDto findById(Long id) {
		Optional<Categoria> obj = repositorio.findById(id);
		Categoria entity = obj.get();
		return new CategoriaDto(entity);
	}

}
