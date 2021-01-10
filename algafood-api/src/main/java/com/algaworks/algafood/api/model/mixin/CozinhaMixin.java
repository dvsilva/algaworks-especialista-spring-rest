package com.algaworks.algafood.api.model.mixin;

import java.util.List;

import com.algaworks.algafood.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CozinhaMixin {

	// @JsonIgnore
	// @JsonProperty("titulo")
	// private String nome;
	
	@JsonIgnore
	private List<Restaurante> restaurantes;
	
}