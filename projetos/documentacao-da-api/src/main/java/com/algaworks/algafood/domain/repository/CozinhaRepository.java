package com.algaworks.algafood.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends CustomJpaRepository<Cozinha, Long> {

//	List<Cozinha> nome(String nome); 
//	List<Cozinha> findQualquerCoisaByNome(String nome); 
	
//	List<Cozinha> findTodasByNome(String nome); 
	List<Cozinha> findTodasByNomeContaining(String nome);
	
//	Page<Cozinha> findTodasByNomeContaining(String nome, Pageable pageable);
	
	Optional<Cozinha> findByNome(String nome); 
	
	boolean existsByNome(String nome);
	
}