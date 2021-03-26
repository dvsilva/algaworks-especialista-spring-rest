package com.algaworks.algafood.domain.exception;

public class CozinhaNaoEncontradaException extends EntidadeNaoEncontradaException {
	
	private static final String MSG_COZINHA_NAO_ENCONTRADO = "Nao existe cadastro de cozinha com código %d";
	
	private static final long serialVersionUID = 1L;

	public CozinhaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
	
	public CozinhaNaoEncontradaException(Long cozinhaId) {
		super(String.format(MSG_COZINHA_NAO_ENCONTRADO, cozinhaId));
	}
	
}
