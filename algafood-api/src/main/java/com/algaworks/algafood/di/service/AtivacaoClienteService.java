package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired // (required = false)
	private List<Notificador> notificadores;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//		// System.out.println("AtivacaoClienteService: " + notificador);
//	}
	
//	public AtivacaoClienteService(String qualuer) {
//		
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for (Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
		
//		if(notificador != null) 
//			this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//		else
//			System.out.println("Não existe notificador, mas cliente foi ativado");
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}