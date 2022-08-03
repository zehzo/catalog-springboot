package com.api.catalog.catalogspringboot.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.catalog.catalogspringboot.entidades.Categoria;
import com.api.catalog.catalogspringboot.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServico {

	@Autowired
	private CategoriaRepositorio repositorio;
	
	public List<Categoria> findAll(){
		return repositorio.findAll();
	}
}
