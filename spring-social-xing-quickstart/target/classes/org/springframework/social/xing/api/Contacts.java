package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Contacts implements Serializable {

	private static final long serialVersionUID = -850206138025373659L;
	private int total;
	private List<User> users;

	public Contacts(int total, List<User> users) {
		this.total = total;
		this.users = users;
	}

	public int getTotal() {
		return total;
	}

	public List<User> getUsers() {
		return users;
	}
}
