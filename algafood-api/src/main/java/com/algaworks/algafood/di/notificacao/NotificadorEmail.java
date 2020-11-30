package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Primary
@Component
public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	// private String hostServidorSmtp;

	/*
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail: " + this.hostServidorSmtp);
	}
	*/

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if (this.caixaAlta)
			mensagem = mensagem.toUpperCase();

		// System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", cliente.getNome(),
		// cliente.getEmail(), this.hostServidorSmtp, mensagem);

		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}