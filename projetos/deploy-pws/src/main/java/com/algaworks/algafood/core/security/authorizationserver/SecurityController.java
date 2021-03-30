package com.algaworks.algafood.core.security.authorizationserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	// OAuth2 - customização da página de login
	@GetMapping("/login")
	public String login() {
		return "pages/login";
	}

	// OAuth2 - customização da página de aprovação (WhitelabelApprovalEndpoint)
	@GetMapping("/oauth/confirm_access")
	public String approval() {
		return "pages/approval";
	}

}
