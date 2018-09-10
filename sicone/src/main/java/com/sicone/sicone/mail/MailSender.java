package com.sicone.sicone.mail;

import javax.mail.MessagingException;

public interface MailSender {
	
	void send(String to, String subject, String body) throws MessagingException;

}
