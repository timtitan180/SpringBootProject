package perscholas.security;

import java.io.IOException;

import javax.servlet.http.HttpServlet;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
	public void onAuthenticationSuccess(HttpServlet request,HttpServlet response,AuthenticationException authentication) throws IOException {
		System.out.println("!!!!LOGIN SUCCESS!!!!");
	}
}
