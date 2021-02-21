package com.algaworks.algafood.core.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedMethods("*"); // padrao GET, POST E HEAD
//			.allowedOrigins("*") // padrao aceita qualquer origin
//			.maxAge(30); // padrao é 1800 segundos = 30 minutos
	}
	
}
