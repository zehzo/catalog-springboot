package com.api.catalog.catalogspringboot.recursos.excessoes;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.catalog.catalogspringboot.servicos.excecoes.EntidadeNaoEncontradaExcessao;

@ControllerAdvice
public class ManipuladorExcessoesRecursos {

	@ExceptionHandler(EntidadeNaoEncontradaExcessao.class)
	public ResponseEntity<ErroPadrao> entidadeNaoEncontrada(EntidadeNaoEncontradaExcessao e, HttpServletRequest request){
		ErroPadrao err = new ErroPadrao();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setError("Recurso não encontrado");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
