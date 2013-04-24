package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NearbyUsers implements Serializable {

	private static final long serialVersionUID = -1326283800936009113L;
	private String updatedAt;
	private User user;
	private Long distance;

	public NearbyUsers(String updatedAt, User user, Long distance) {
		super();
		this.updatedAt = updatedAt;
		this.user = user;
		this.distance = distance;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public User getUser() {
		return user;
	}

	public Long getDistance() {
		return distance;
	}

}
