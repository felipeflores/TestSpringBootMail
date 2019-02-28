package br.com.teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.teste.email.EmailService;
import br.com.teste.email.SmtpEmailService;

@Configuration
public class COnfig {

	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
