package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactRequests implements Serializable {

	private static final long serialVersionUID = 849120956367473486L;
	private List<ContactRequest> contactRequests;

	public ContactRequests(List<ContactRequest> contactRequests) {
		this.contactRequests = contactRequests;
	}

	public List<ContactRequest> getContactRequests() {
		return contactRequests;
	}
}
