package com.gabriel.teste.autenticacao.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ExeptionHandlerConfig {
	
	  @Bean(name="messageSource")
	    public ResourceBundleMessageSource bundleMessageSource() {
		    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		    messageSource.setBasename("messages");
		    messageSource.setDefaultEncoding("UTF-8");
		    return messageSource;
	    }

}
