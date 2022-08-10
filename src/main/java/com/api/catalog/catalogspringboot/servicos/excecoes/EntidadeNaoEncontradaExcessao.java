package com.api.catalog.catalogspringboot.servicos.excecoes;

public class EntidadeNaoEncontradaExcessao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontradaExcessao(String msg) {
		super(msg);
	}
}
