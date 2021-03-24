package com.algaworks.algafood.core.security;

import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

@Configuration
@EnableWebSecurity
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
//				.antMatchers("/v1/cozinhas/**").permitAll()
//				.anyRequest().authenticated()
				.antMatchers(HttpMethod.POST, "/v1/cozinhas/**").hasAuthority("EDITAR_COZINHAS")
				.antMatchers(HttpMethod.PUT, "/v1/cozinhas/**").hasAuthority("EDITAR_COZINHAS")
				.antMatchers(HttpMethod.GET, "/v1/cozinhas/**").authenticated()
				.anyRequest().denyAll()
			.and()
				.cors() // configura para permitir OPTIONS (verbos permitidos) pois browser faz pre-flyght
			.and()
//				.oauth2ResourceServer().opaqueToken(); // configuração para opaque tokens
				.oauth2ResourceServer().jwt()
					.jwtAuthenticationConverter(jwtAuthenticationConverter());
	}

	// configuração para fazer restrições de acessos [extração dos claims]
	private JwtAuthenticationConverter jwtAuthenticationConverter() {
		var jwtAuthenticationConverter = new JwtAuthenticationConverter();
		jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwt -> {
			var authorities = jwt.getClaimAsStringList("authorities");
			
			if (authorities == null) {
				authorities = Collections.emptyList();
			}
			
			return authorities.stream()
					.map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList());
		});
		
		return jwtAuthenticationConverter;
	}
	
	// configuração para chave simétrica
//	@Bean
//	public JwtDecoder jwtDecoder() {
//		var secretKey = new SecretKeySpec("89a7sd89f7as98f7dsa98fds7fd89sasd9898asdf98s".getBytes(), "HmacSHA256");
//		
//		return NimbusJwtDecoder.withSecretKey(secretKey).build();
//	}
}
