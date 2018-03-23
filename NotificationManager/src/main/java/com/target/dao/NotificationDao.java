package com.target.dao;

import com.target.model.GmailNotification;
import com.target.model.Notification;

/**
 * @author Neha D Naik
 *
 */

public interface NotificationDao<T> {

	
	public T acceptMessage(Notification t);
	
	public T getMessage(Integer t);

}
