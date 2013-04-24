package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class TagsNode implements Serializable {

	private static final long serialVersionUID = -4065191962514705628L;
	private Tags tags;

	public TagsNode(Tags tags) {
		this.tags = tags;
	}

	public Tags getTags() {
		return tags;
	}
}
