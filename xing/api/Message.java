package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Message implements Serializable {

	private static final long serialVersionUID = -1253077427419691284L;

	private final String id;
	private Date createdAt;
	private String content;
	private boolean read;
	private User sender;

	public Message(String id, Date createdAt, String content, boolean read) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.content = content;
		this.read = read;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getId() {
		return id;
	}
}
