package com.securityOauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class EmployeSecurityConfig extends WebSecurityConfigurerAdapter{
	
	public void configure(WebSecurity web)throws Exception{
		
		web.ignoring().antMatchers("/resources/**");
		
	}

	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/user/getEmployeesList")
		.hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll();

		http.csrf().disable();
		
		
	}
		 public void configure(AuthenticationManagerBuilder authenticationMgr) throws Exception {
		        authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin")
		            .authorities("ROLE_ADMIN");
		
	
}
}
