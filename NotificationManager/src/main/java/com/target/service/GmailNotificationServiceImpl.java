package com.target.service;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.mail.smtp.SMTPTransport;
import com.sun.mail.util.BASE64EncoderStream;
import com.target.dao.GmailNotificationDao;
import com.target.model.GmailNotification;
import com.target.model.Notification;

/**
 * @author Neha D Naik
 *
 */
@Service(value="notificationService")
public class GmailNotificationServiceImpl implements GmailNotificationService{

	@Autowired
	private GmailNotificationDao gmailNotificationDao;
	
	
	@Override
	public GmailNotification acceptMessage(Notification t) {
		// TODO Auto-generated method stub
		return gmailNotificationDao.acceptMessage((GmailNotification) t);
	}


	@Override
	public GmailNotification getMessage(Integer t) {
		// TODO Auto-generated method stub
		return gmailNotificationDao.getMessage(t);
	}


	@Override
	public String pushNotification(String id, Notification t) {
		GmailNotification temp=(GmailNotification)t;
		return sendMail("smtp.gmail.com","587","rsamrat073","K1t1dRUiBuQZ9nkWYyn6eQkL",temp.getFrom(),"rsamrat073",temp.getTo(),temp.getSubject(),temp.getMessage());
	}

	
	String  sendMail(String smtpServerHost, String smtpServerPort,  String smtpUserName, String smtpUserAccessToken, String fromUserEmail, String fromUserFullName, String toEmail, String subject, String body) {
        try {
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.port", smtpServerPort);
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getDefaultInstance(props);
            session.setDebug(true);

            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(fromUserEmail, fromUserFullName));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subject);
            msg.setContent(body, "text/html");

            SMTPTransport transport = new SMTPTransport(session, null);
            transport.connect(smtpServerHost, smtpUserName, null);
            transport.issueCommand("AUTH XOAUTH2 " + new String(BASE64EncoderStream.encode(String.format("user=%s\1auth=Bearer %s\1\1", smtpUserName, smtpUserAccessToken).getBytes())), 235);
            transport.sendMessage(msg, msg.getAllRecipients());
            
            return "Message Pushed to Gmail!!!";
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return ex.getMessage();
        }
    }
}
