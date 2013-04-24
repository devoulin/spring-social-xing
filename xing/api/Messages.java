package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Messages implements Serializable {

	private static final long serialVersionUID = -7967014830638861264L;

	private int total;
	private List<Message> items;

	public Messages(int total, List<Message> items) {
		super();
		this.total = total;
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Message> getItems() {
		return items;
	}

	public void setItems(List<Message> items) {
		this.items = items;
	}
}
