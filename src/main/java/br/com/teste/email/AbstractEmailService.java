package br.com.teste.email;

import java.util.Date;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService {
	
	@Value("${default.sender}")
	private String sender;
	
	public void sendSimpleEmail(String assunto, String mensagem, String to) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(to);
		sm.setFrom(sender);
		sm.setSubject(assunto);
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(mensagem);
		sendEmail(sm);
	}
	
	public void sendHtmlEmail(String assunto, String mensagem, String to) throws MessagingException {
		sendHtmlEmail(assunto, mensagem, to, sender);
	}
	

}
