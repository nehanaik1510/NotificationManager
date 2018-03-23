package com.target.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.target.model.GmailNotification;
/**
 * @author Neha D Naik
 *
 */


@RestController
@RequestMapping(value="/gmail")
public class GmailNotificationController extends NotificationController<GmailNotification>{

}
