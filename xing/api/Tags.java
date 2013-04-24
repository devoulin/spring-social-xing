package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Tags implements Serializable {

	private static final long serialVersionUID = 3158787077448808070L;
	private int total;
	private Map<String, String> items;

	public Tags(int total, Map<String, String> items) {
		this.total = total;
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public Map<String, String> getItems() {
		return items;
	}
}
