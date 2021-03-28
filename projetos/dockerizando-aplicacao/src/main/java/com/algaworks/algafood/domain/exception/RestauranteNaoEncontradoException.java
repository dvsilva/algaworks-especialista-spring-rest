package com.algaworks.algafood.domain.exception;

public class RestauranteNaoEncontradoException extends EntidadeNaoEncontradaException {
	
	private static final String MSG_RESTAURANTE_NAO_ENCONTRADO = "Nao existe cadastro de restaurante com código %d";
	
	private static final long serialVersionUID = 1L;

	public RestauranteNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public RestauranteNaoEncontradoException(Long restauranteId) {
		super(String.format(MSG_RESTAURANTE_NAO_ENCONTRADO, restauranteId));
	}
	
}
