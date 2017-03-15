package org.forpdi.system;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

import br.com.caelum.vraptor.boilerplate.util.EmailUtils;

public class EmailUtilsPlugin {
	
	/**
	 * Envia email de notificações
	 * @param toEmail
	 * 			Email
	 * @param toName
	 * 			Nome
	 * @param subject
	 * 			Assunto
	 * @param msg
	 * 		Mensagem
	 * @return
	 * @throws EmailException
	 */
	public static String sendSimpleEmail(String toEmail, String toName, String subject, String msg) throws EmailException {
		Email email = EmailUtils.getSimpleEmail();
		email.setAuthentication("noreply@forpdi.org", "NoReply@123!");
		email.setFrom("noreply@forpdi.org", "ForPDI");
		email.setHostName("progolden.com.br");
		email.setSmtpPort(587);
		email.setSSLOnConnect(false);
		email.addTo(toEmail, toName);
		email.setSubject(subject);
		email.setMsg(msg);
		email.setStartTLSEnabled(true);
		//email.setStartTLSRequired(true);
		return email.send();
	}
	/**
	 * Eviar email com imagens e outros contéudos
	 * @param toEmail
	 * 			Email
	 * @param toName
	 * 			Nome
	 * @param subject
	 * 			Assunto
	 * @param msg
	 * 			Mensagem
	 * @return
	 * @throws EmailException
	 */
	public static String sendHtmlEmail(String toEmail, String toName, String subject, String msg) throws EmailException {
		Email email = EmailUtils.getHtmlEmail();
		email.setAuthentication("noreply@forpdi.org", "NoReply@123!");
		email.setFrom("noreply@forpdi.org", "ForPDI");
		email.setHostName("progolden.com.br");
		email.setSmtpPort(587);
		email.setSSLOnConnect(false);
		email.addTo(toEmail, toName);
		email.setSubject(subject);
		email.setMsg(msg);
		email.setStartTLSEnabled(true);
		//email.setStartTLSRequired(true);
		return email.send();
	}
}
