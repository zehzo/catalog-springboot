package com.api.catalog.catalogspringboot.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.catalog.catalogspringboot.entidades.Categoria;
import com.api.catalog.catalogspringboot.servicos.CategoriaServico;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
	
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = servico.findAll();
		return ResponseEntity.ok().body(list);
		
		
	}
}
