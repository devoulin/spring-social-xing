package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ConversationNode implements Serializable {

	private static final long serialVersionUID = 531915201514794173L;
	private Conversation conversation;

	public ConversationNode(Conversation conversation) {
		this.conversation = conversation;
	}

	public Conversation getConversation() {
		return conversation;
	}
}
