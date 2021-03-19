package com.algaworks.algafood.core.web;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Autowired
	private ApiDeprecationHandler apiDeprecationHandler;

	@Autowired
	private ApiRetirementHandler apiRetirementHandler;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedMethods("*"); // padrao GET, POST E HEAD
//			.allowedOrigins("*") // padrao aceita qualquer origin
//			.maxAge(30); // padrao é 1800 segundos = 30 minutos
	}

	// configurar a versão 2 como padrão quando o media type não for informado
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		configurer.defaultContentType(AlgaMediaTypes.V2_APPLICATION_JSON);
//	}

	// Adciona incerceptadores de requisições (utilizado para versionamento de API)
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(apiDeprecationHandler);
		registry.addInterceptor(apiRetirementHandler);
	}
	
	@Bean
	public Filter shallowEtagHeaderFilter() {
		return new ShallowEtagHeaderFilter();
	}
}
