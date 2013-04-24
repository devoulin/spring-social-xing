package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ProfileMessage implements Serializable {

	private static final long serialVersionUID = -5773655890476585008L;

	private String updatedAt;
	private String message;

	public ProfileMessage(String updatedAt, String message) {
		this.updatedAt = updatedAt;
		this.message = message;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getMessage() {
		return message;
	}
}
