package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactRequest implements Serializable {

	private static final long serialVersionUID = 7795309076096156739L;
	private final String senderId;
	private final User sender;
	private final String message;
	private final String receivedAt;
	private String recipientId;

	public ContactRequest(String senderId, User sender, String message, String receivedAt) {
		this.senderId = senderId;
		this.sender = sender;
		this.message = message;
		this.receivedAt = receivedAt;
	}

	public String getSenderId() {
		return senderId;
	}

	public User getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}

	public String getReceivedAt() {
		return receivedAt;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}
}
