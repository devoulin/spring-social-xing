package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface BookmarkOperations {

	/**
	 * Returns a list of bookmarked users for the given user_id. This list is 
	 * sorted by the creation date of the bookmarks.
	 * @param userId required. ID of the user whose bookmarks are to be returned
	 * @param limit optional. Restrict the number of bookmarks to be returned. This 
	 * must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 */

	Bookmarks getBookmarks(String userId, Integer limit, Integer offset);

	/**
	 * Create a bookmark.
	 * @param id required. ID of the user to be bookmarked
	 * @param userId required. ID of the user creating the bookmark
	 */

	void createBookmark(String id, String userId);

	/**
	 * Delete a bookmark.
	 * @param id required. ID of a bookmarked user.
	 * @param userId required. ID of the user deleting the bookmark
	 */

	void deleteBookmark(String id, String userId);
}
