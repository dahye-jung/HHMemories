package com.hhhmemories.cloud.mail.controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;

@Controller
public class mailController {
	
	public void naverMailSend(String email, String memberId, String tempPassword) {
		// 메일 발신자 계정 정보
		String host = "smtp.naver.com";
		String user = "hyesounglee@naver.com";
		String password = "dlfjftnrk34@";
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
			
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			
			// 메일 제목
			message.setSubject("[" + memberId + "]님 임시비밀번호를 발급하였습니다.");
			
			// 메일 내용
			message.setText("임시 비밀번호 : " + tempPassword);
			
			// 메일 전송
			Transport.send(message);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
}
