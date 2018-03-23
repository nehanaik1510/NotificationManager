package com.target.dao;

import org.springframework.stereotype.Repository;

import com.target.model.GmailNotification;
import com.target.model.Notification;

/**
 * @author Neha D Naik
 *
 */


@Repository(value="gmailNotificationDao")
public class GmailNotificationDaoImpl implements GmailNotificationDao{

	

	@Override
	public GmailNotification acceptMessage(Notification t) {
		// TODO Auto-generated method stub
		return (GmailNotification) t;
	}

	@Override
	public GmailNotification getMessage(Integer t) {
		// TODO Auto-generated method stub
		return new GmailNotification();
	}

}
