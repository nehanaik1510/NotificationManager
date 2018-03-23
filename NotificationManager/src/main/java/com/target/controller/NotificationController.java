/**
 * 
 */
package com.target.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.target.model.Notification;
import com.target.service.NotificationService;

/**
 * @author Neha D Naik
 *
 */

public class NotificationController<T extends Notification> {

	@Autowired
	private NotificationService notificationService;

	@RequestMapping(method=RequestMethod.POST)
	public T acceptMessage(@RequestBody T t) {
		
		return (T) notificationService.acceptMessage(t);
	}

	
	
	@RequestMapping(method=RequestMethod.GET)
	public T getMessage(Integer id) {
		
		return (T) notificationService.getMessage(id);
	}
	

}
