package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
