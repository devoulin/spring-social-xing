package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class MessagesNode implements Serializable {

	private static final long serialVersionUID = 8563419338774033154L;
	private Messages messages;

	public MessagesNode(Messages messages) {
		this.messages = messages;
	}

	public Messages getMessages() {
		return messages;
	}
}
