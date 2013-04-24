package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactPaths implements Serializable {

	private static final long serialVersionUID = -1439991238995895283L;

	private Paths paths;
	private int distance;
	private int total;

	public ContactPaths(Paths paths, int distance, int total) {
		this.paths = paths;
		this.distance = distance;
		this.total = total;
	}

	public Paths getPaths() {
		return paths;
	}

	public int getDistance() {
		return distance;
	}

	public int getTotal() {
		return total;
	}
}
