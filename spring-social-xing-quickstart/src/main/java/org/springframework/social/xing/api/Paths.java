package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Paths implements Serializable {

	private static final long serialVersionUID = 6906883457313992312L;
	private List<User> users;

	public Paths(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}
}
