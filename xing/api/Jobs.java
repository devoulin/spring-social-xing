package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Jobs implements Serializable {

	private static final long serialVersionUID = 61566071446314776L;

	private int total;
	private List<Job> items;

	public Jobs(int total, List<Job> items) {
		this.total = total;
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public List<Job> getItems() {
		return items;
	}
}
