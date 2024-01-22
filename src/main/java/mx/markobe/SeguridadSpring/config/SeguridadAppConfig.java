package mx.markobe.SeguridadSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

	//Método donde se configura la seguridad
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder usuarios = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(usuarios.username("Marco").password("123").roles("administrador"))
		.withUser(usuarios.username("Antonio").password("456").roles("usuario"))
		.withUser(usuarios.username("Ana").password("789").roles("ayudante"))
		.withUser(usuarios.username("Laura").password("321").roles("administrador"));
		
	}

}
