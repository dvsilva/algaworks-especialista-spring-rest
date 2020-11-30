package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoNotificador;

// @Component
public class AtivacaoClienteService { // implements InitializingBean, DisposableBean {
	
	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	// @Qualifier("sms")
	@Autowired // (required = false)
	private Notificador notificador;
	// private List<Notificador> notificadores;
	
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
	public void init() {
		System.out.println("INIT " + notificador);
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
//		for (Notificador notificador : notificadores) {
//			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
//		}
		
		if(notificador != null) 
			this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		else
			System.out.println("Não existe notificador, mas cliente foi ativado");
	}


//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}