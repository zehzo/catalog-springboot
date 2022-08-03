package com.api.catalog.catalogspringboot.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.catalog.catalogspringboot.entidades.Categoria;
import com.api.catalog.catalogspringboot.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaRepositorio repositorio;
	
	@Transactional(readOnly = true)
	public List<Categoria> findAll(){
		return repositorio.findAll();
	}
}
