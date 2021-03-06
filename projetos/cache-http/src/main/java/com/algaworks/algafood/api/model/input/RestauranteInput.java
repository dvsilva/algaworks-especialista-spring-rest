package com.algaworks.algafood.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteInput {
	
//	@NotNull // nao pode ser null
//	@NotEmpty // nao pode ser vazio
	@NotBlank // nao pode ter espacos em branco
	private String nome;
	
//	@DecimalMin("0")
//	@TaxaFrete
//	@Multiplo(numero = 5)
	@NotNull 
	@PositiveOrZero
	private BigDecimal taxaFrete;

//	@ConvertGroup(from = Default.class, to = Groups.CozinhaId.class)
	@Valid
	@NotNull
	private CozinhaIdInput cozinha;
	
	@Valid
	@NotNull
	private EnderecoInput endereco;
	
}