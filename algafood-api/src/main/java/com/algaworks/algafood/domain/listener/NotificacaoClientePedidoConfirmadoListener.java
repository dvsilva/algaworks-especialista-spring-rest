package com.algaworks.algafood.domain.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import com.algaworks.algafood.domain.event.PedidoConfirmadoEvent;
import com.algaworks.algafood.domain.model.Pedido;
import com.algaworks.algafood.domain.service.EnvioEmailService;
import com.algaworks.algafood.domain.service.EnvioEmailService.Mensagem;

@Component
public class NotificacaoClientePedidoConfirmadoListener {

	@Autowired
	private EnvioEmailService envioEmail;
	
//	@EventListener
	// define a fase especifica da transacao para ser executada 
	// executa depois que a transacao foi commitada
	@TransactionalEventListener // (phase = TransactionPhase.BEFORE_COMMIT) não faz o update se der erro no envio de email
	public void aoConfirmarPedido(PedidoConfirmadoEvent event) {
//		if(true) throw new IllegalArgumentException();
		
		Pedido pedido = event.getPedido();

//		var mensagem = Mensagem.builder()
//		.assunto(pedido.getRestaurante().getNome() + " - Pedido confirmado")
//		.corpo("O pedido de código <strong>" + pedido.getCodigo() + "</strong> foi confirmado!")
//		.destinatario(pedido.getCliente().getEmail())
//		.build();
		
		var mensagem = Mensagem.builder()
				.assunto(pedido.getRestaurante().getNome() + " - Pedido confirmado")
				.corpo("emails/pedido-confirmado.html")
				.variavel("pedido", pedido)
				.destinatario(pedido.getCliente().getEmail())
				.build();

		envioEmail.enviar(mensagem);
	}
	
}
