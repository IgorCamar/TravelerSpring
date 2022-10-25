package br.org.com.Traveler.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	private UserDetailsService userDetailsServiceImpl;
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/").permitAll();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	
}
