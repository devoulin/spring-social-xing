package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Bookmark implements Serializable {

	private static final long serialVersionUID = 334996866020235740L;
	private String createdAt;
	private User user;

	public Bookmark(String createdAt, User user) {
		this.createdAt = createdAt;
		this.user = user;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public User getUser() {
		return user;
	}
}
