package com.target.service;

import com.target.model.Notification;

/**
 * @author Neha D Naik
 *
 */

public interface NotificationService<T> {

	T acceptMessage(Notification t);

	T getMessage(Integer id);

}
