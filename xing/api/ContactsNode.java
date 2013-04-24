package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactsNode implements Serializable {

	private static final long serialVersionUID = -308246628619989476L;
	private Contacts contacts;

	public ContactsNode(Contacts contacts) {
		this.contacts = contacts;
	}

	public Contacts getContacts() {
		return contacts;
	}
}
