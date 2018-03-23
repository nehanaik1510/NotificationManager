package com.target.model;

/**
 * @author Neha D Naik
 *
 */

public class GmailNotification extends Notification{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6677479904582345135L;
	private String to;
	private String from;
	private String subject;
	private String message;
	
	public GmailNotification() {
		// TODO Auto-generated constructor stub
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "GmailNotification [to=" + to + ", from=" + from + ", subject=" + subject + ", message=" + message + "]";
	}
	
	
	
	
}
