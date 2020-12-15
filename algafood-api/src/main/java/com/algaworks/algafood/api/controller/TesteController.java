package com.algaworks.algafood.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	/* @RequestParam("nome") eh opcional [eh a forma padrao]*/ 
	@GetMapping("/cozinhas/por-nome")
	public List<Cozinha> cozinhasPorNome(/* @RequestParam("nome") */ String nome) {
		return cozinhaRepository.findTodasByNome(nome);
	}

	@GetMapping("/cozinhas/unica-por-nome")
	public Optional<Cozinha> cozinhaPorNome(String nome) {
		return cozinhaRepository.findByNome(nome);
	}
	
}