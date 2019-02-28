package br.com.teste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.email.EmailService;

@Service
public class TesteService {

	@Autowired
	private EmailService emailService;
	
}
