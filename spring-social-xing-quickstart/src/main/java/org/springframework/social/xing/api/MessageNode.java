package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class MessageNode implements Serializable {

	private static final long serialVersionUID = -7898362041053999278L;
	private Message message;

	public MessageNode(Message message) {
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}
}
