package com.sicone.sicone.controller;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sicone.sicone.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {

		mailSender.send("mail@example.com", "Savanas are waiting 4 u", "Don't look, i'm naked");

		return "Mail Sent.";
	}

}
