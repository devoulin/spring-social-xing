package org.springframework.social.xing.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class Bookmarks implements Serializable {

	private static final long serialVersionUID = 2029213287001043742L;
	private List<Bookmark> bookmarks;

	public Bookmarks(List<Bookmark> bookmarks) {
		this.bookmarks = bookmarks;
	}

	public List<Bookmark> getBookmarks() {
		return bookmarks;
	}
}
