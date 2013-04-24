package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Conversations implements Serializable {

	private static final long serialVersionUID = 6297645898347375395L;
	private String unreadCount;
	private String total;
	private List<Conversation> items;

	public Conversations(String unreadCount, List<Conversation> items, String total) {
		this.unreadCount = unreadCount;
		this.items = items;
		this.total = total;
	}

	public List<Conversation> getItems() {
		return items;
	}

	public String getUnreadCount() {
		return unreadCount;
	}

	public String getTotal() {
		return total;
	}
}
