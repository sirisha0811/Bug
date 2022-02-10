package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public String sendEmail() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("tcstraining08@gmail.com");
		message.setTo("sirisha0814@gmail.com");
		message.setSubject("Bug");
		message.setText("Updated bug");
		
		javaMailSender.send(message);
		return "Mail sent Successfully";
		
	}

}
