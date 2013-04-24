package org.springframework.social.xing.api;

import java.io.Serializable;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class BookmarksNode implements Serializable {

	private static final long serialVersionUID = 8160946942857418667L;
	private Bookmarks bookmarks;

	public BookmarksNode(Bookmarks bookmarks) {
		this.bookmarks = bookmarks;
	}

	public Bookmarks getBookmarks() {
		return bookmarks;
	}
}
