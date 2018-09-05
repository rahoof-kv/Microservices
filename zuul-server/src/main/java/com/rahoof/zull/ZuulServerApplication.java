package com.rahoof.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ZuulServerApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.logout().and().antMatcher("/**").authorizeRequests()
                .antMatchers("/login","/auth/**").permitAll()
                .anyRequest().authenticated().and().csrf().disable();
    }
}
