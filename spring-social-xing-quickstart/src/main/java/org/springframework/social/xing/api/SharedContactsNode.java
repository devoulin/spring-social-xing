package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class SharedContactsNode implements Serializable {

	private static final long serialVersionUID = -7930481597475001238L;
	private Contacts contacts;

	public SharedContactsNode(Contacts contacts) {
		this.contacts = contacts;
	}

	public Contacts getContacts() {
		return contacts;
	}
}
