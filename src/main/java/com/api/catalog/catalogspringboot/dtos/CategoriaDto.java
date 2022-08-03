package com.api.catalog.catalogspringboot.dtos;

import java.io.Serializable;

import com.api.catalog.catalogspringboot.entidades.Categoria;

public class CategoriaDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	public CategoriaDto() {
		super();
	}

	public CategoriaDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CategoriaDto(Categoria entidade) {
		this.id = entidade.getId();
		this.name = entidade.getName(); 
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
