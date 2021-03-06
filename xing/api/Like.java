package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Like implements Serializable {

	private static final long serialVersionUID = -3909217568092760857L;
	private String type;
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
