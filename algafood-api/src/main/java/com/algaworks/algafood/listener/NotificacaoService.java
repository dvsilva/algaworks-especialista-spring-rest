package com.algaworks.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorProperties;
import com.algaworks.algafood.di.notificacao.TipoNotificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@Autowired
	private NotificadorProperties properties;
	
//	@Value("${notificador.email.host-servidor}")
//	private String host;

//	@Value("${notificador.email.porta-servidor}")
//	private String port;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
//		System.out.println("Host: " + host);
//		System.out.println("Porta: " + port);
		
		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta: " + properties.getPortServidor());
		
		System.out.println("Cliente " + event.getCliente().getNome() + " agora está ativo");
		this.notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}

}
