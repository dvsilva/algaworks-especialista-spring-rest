package com.algaworks.algafood.domain.exception;

public class EstadoNaoEncontradoException extends EntidadeNaoEncontradaException {
	
	private static final String MSG_ESTADO_NAO_ENCONTRADO = "Nao existe cadastro de estado com código %d";
	
	private static final long serialVersionUID = 1L;

	public EstadoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public EstadoNaoEncontradoException(Long estadoId) {
		super(String.format(MSG_ESTADO_NAO_ENCONTRADO, estadoId));
	}
	
}
