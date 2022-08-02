package com.api.catalog.catalogspringboot.recursos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.catalog.catalogspringboot.entidades.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = new ArrayList<>();
		list.add(new Categoria(1L, "Ferramentas"));
		list.add(new Categoria(2L, "Decoração"));
		return ResponseEntity.ok().body(list);
		
	}
}
