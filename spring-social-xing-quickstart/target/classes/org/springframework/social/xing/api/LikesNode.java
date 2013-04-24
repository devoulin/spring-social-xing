package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class LikesNode implements Serializable {

	private static final long serialVersionUID = 2696902778342950845L;
	private List<Like> likes;

	public List<Like> getLikes() {
		return likes;
	}

	public LikesNode(List<Like> likes) {
		this.likes = likes;
	}

}
