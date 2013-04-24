package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Contact implements Serializable {

	private static final long serialVersionUID = -6039660965917213279L;
	private Company company;

	public Contact(Company company) {
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}
}
