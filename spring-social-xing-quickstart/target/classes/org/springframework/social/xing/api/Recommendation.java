package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Recommendation implements Serializable {

	private static final long serialVersionUID = -7459782820421471001L;
	private User user;

	public Recommendation(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
