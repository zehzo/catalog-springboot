package com.api.catalog.catalogspringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.catalog.catalogspringboot.entidades.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{
	
}
