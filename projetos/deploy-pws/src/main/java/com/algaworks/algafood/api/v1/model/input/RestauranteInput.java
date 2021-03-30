package com.algaworks.algafood.api.v1.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteInput {

	@ApiModelProperty(example = "Thai Gourmet", required = true)
//	@NotNull // nao pode ser null
//	@NotEmpty // nao pode ser vazio
	@NotBlank // nao pode ter espacos em branco
	private String nome;

	@ApiModelProperty(example = "12.00", required = true)
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