package com.algaworks.algafood.jpa.restaurante;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)  
			.web(WebApplicationType.NONE)
			.run(args);
		
		RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Outback Steakhouse");
		restaurante1.setTaxaFrete(BigDecimal.TEN);
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Parmê");
		restaurante1.setTaxaFrete(BigDecimal.ONE);
		
		restaurante1 = restauranteRepository.salvar(restaurante1);
		restaurante2 = restauranteRepository.salvar(restaurante2);
		
		System.out.printf("%d - %s \n", restaurante1.getId(), restaurante1.getNome());
		System.out.printf("%d - %s \n", restaurante2.getId(), restaurante2.getNome());
	}

}
