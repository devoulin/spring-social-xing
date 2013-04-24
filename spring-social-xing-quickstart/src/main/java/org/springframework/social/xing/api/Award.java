package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Award implements Serializable {

	private static final long serialVersionUID = -1213711525345362506L;

	private String name;
	private String dateAwarded;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateAwarded() {
		return dateAwarded;
	}

	public void setDateAwarded(String dateAwarded) {
		this.dateAwarded = dateAwarded;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
