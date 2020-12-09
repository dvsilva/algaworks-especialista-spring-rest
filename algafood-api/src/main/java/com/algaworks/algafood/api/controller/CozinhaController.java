package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@RestController // @Controller + @ResponseBody
@RequestMapping(value = "/cozinhas") // , produces = MediaType.APPLICATION_JSON_VALUE)
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	// @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	// @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	@GetMapping
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}
	
	@GetMapping("/{cozinhaId}")
	public Cozinha buscar(@PathVariable/*("cozinhaId")*/ Long cozinhaId) {
		return cozinhaRepository.buscar(cozinhaId);
	}
}
