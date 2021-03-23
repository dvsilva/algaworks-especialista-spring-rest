package com.algaworks.algafood.auth;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.CompositeTokenGranter;
import org.springframework.security.oauth2.provider.TokenGranter;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtKeyStoreProperties jwtKeyStoreProperties;
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients
			.inMemory() 
				.withClient("algafood-web") // client front end com interação com o usuário (password and refresh_token)
				.secret(passwordEncoder.encode("web123"))
				.authorizedGrantTypes("password", "refresh_token")
				.scopes("write", "read")
				.accessTokenValiditySeconds(6 * 60 * 60)// 6 horas (padrão é 12 horas)
				.refreshTokenValiditySeconds(60 * 24 * 60 * 60) // 60 dias (padrão é 30 dias)
				
			.and() // client de relatorios (authorization code grant type)
				.withClient("foodanalytics")
//				.secret(passwordEncoder.encode("food123"))
				.secret(passwordEncoder.encode(""))
				.authorizedGrantTypes("authorization_code")
				.scopes("write", "read")
				.redirectUris("http://www.foodanalytics.local:8082")
				
			.and() // novo client (implicit grant type)
				.withClient("webadmin")
				.authorizedGrantTypes("implicit")
				.scopes("write", "read")
				.redirectUris("http://aplicacao-cliente")
				
			.and()
				.withClient("faturamento") // aplicação backend (client credentials grant type)
				.secret(passwordEncoder.encode("faturamento123"))
				.authorizedGrantTypes("client_credentials")
				.scopes("write", "read")
				
			.and()
				.withClient("checktoken") // resource server (introspecção - verificar token válido)
					.secret(passwordEncoder.encode("check123"));
	}
	
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
//		security.checkTokenAccess("isAuthenticated()");
		security.checkTokenAccess("permitAll()")
			.tokenKeyAccess("permitAll()") // obter a chave publica /oauth/token_key
			.allowFormAuthenticationForClients();// permitir passar credenciais no corpo da resposta (client_id)
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
			.authenticationManager(authenticationManager)
			.userDetailsService(userDetailsService)
			// configura para não reutilizar refresh_tokens
			// sempre que é gerado um novo tem a validade renovada (30 dias)
			.reuseRefreshTokens(false)
			// configurar access token converter
			.accessTokenConverter(jwtAccessTokenConverter())
			.tokenGranter(tokenGranter(endpoints));
	}
	
	@Bean
	public JwtAccessTokenConverter jwtAccessTokenConverter() {
		var jwtAccessTokenConverter = new JwtAccessTokenConverter();
		// chave simétrica
//		jwtAccessTokenConverter.setSigningKey("89a7sd89f7as98f7dsa98fds7fd89sasd9898asdf98s");
		
		// chave assimétrica
		var jksResource = new ClassPathResource(jwtKeyStoreProperties.getPath());
	    var keyStorePass = jwtKeyStoreProperties.getPassword();
	    var keyPairAlias = jwtKeyStoreProperties.getKeypairAlias();
		
		var keyStoreKeyFactory = new KeyStoreKeyFactory(jksResource, keyStorePass.toCharArray());
		var keyPair = keyStoreKeyFactory.getKeyPair(keyPairAlias);
		
		jwtAccessTokenConverter.setKeyPair(keyPair);
		
		return jwtAccessTokenConverter;
	}
	
	private TokenGranter tokenGranter(AuthorizationServerEndpointsConfigurer endpoints) {
		var pkceAuthorizationCodeTokenGranter = new PkceAuthorizationCodeTokenGranter(endpoints.getTokenServices(),
				endpoints.getAuthorizationCodeServices(), endpoints.getClientDetailsService(),
				endpoints.getOAuth2RequestFactory());
		
		var granters = Arrays.asList(pkceAuthorizationCodeTokenGranter, endpoints.getTokenGranter());
		
		return new CompositeTokenGranter(granters);
	}
	
}
