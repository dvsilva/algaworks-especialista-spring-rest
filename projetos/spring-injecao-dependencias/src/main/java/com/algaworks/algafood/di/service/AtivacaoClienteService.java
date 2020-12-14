package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService { // implements InitializingBean, DisposableBean {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
//	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
//	@Qualifier("sms")
//	@Autowired // (required = false)
//	private Notificador notificador;
//	private List<Notificador> notificadores;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//		// System.out.println("AtivacaoClienteService: " + notificador);
//	}
	
//	public AtivacaoClienteService(String qualuer) {
//		
//	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//	}
	
//	@PostConstruct
//	public void init() {
//		System.out.println("INIT " + notificador);
//	}
	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("DESTROY");
//	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
//		for (Notificador notificador : notificadores) {
//			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//		}
		
		// dizer para o container que o cliente está ativo neste momento
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
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