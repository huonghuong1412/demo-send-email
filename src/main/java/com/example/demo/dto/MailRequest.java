package com.example.demo.dto;

public class MailRequest {

	private String to;
	private String from;
	private String name;
	private String subject;

	public MailRequest() {
		super();
	}

	public MailRequest(String to, String from, String name, String subject) {
		super();
		this.to = to;
		this.from = from;
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

}
