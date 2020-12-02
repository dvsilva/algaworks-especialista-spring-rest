package com.algaworks.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;

	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
		return query.getResultList();
	}
	
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional // executado dentro de uma transação
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	

}
