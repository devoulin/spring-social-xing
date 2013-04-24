package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class CommentsNode implements Serializable {

	private static final long serialVersionUID = 1801455650185752095L;
	private List<Comment> comments;

	public List<Comment> getComments() {
		return comments;
	}

	public CommentsNode(List<Comment> comments) {
		this.comments = comments;
	}

}
