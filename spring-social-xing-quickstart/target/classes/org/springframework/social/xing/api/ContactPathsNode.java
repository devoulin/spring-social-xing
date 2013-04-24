package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactPathsNode implements Serializable {

	private static final long serialVersionUID = 2269379794070623615L;
	private ContactPaths contactPaths;

	public ContactPathsNode(ContactPaths contactPaths) {
		this.contactPaths = contactPaths;
	}

	public ContactPaths getContactPaths() {
		return contactPaths;
	}
}
