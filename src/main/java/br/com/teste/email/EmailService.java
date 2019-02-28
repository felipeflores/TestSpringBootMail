package br.com.teste.email;

import javax.mail.MessagingException;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

public interface EmailService {
	
	void sendEmail(SimpleMailMessage msg);
	void sendHtmlEmail(String assunto, String mensagem, String to, String from) throws MessagingException;
	void sendHtmlEmail(String assunto, String mensagem, String to) throws MessagingException;
	void sendSimpleEmail(String assunto, String mensagem, String to);
	
}
