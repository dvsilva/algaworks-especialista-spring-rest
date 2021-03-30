package com.algaworks.algafood.domain.exception;

public class CidadeNaoEncontradaException extends EntidadeNaoEncontradaException {
	
	private static final String MSG_CIDADE_NAO_ENCONTRADA = "Nao existe cadastro de cidade com código %d";
	
	private static final long serialVersionUID = 1L;

	public CidadeNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
	
	public CidadeNaoEncontradaException(Long cidadeId) {
		super(String.format(MSG_CIDADE_NAO_ENCONTRADA, cidadeId));
	}
	
}
