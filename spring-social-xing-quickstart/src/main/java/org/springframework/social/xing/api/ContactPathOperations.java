package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface ContactPathOperations {

	/**
	 * Get the shortest contact path(s) between a user and any other XING user.
	 * @param otherUserId required. ID of any other XING user
	 * @param userId required. ID of the user whose bookmarks are to be returned
	 * @param allPaths optional. Specifies whether this call returns just one 
	 * contact path (default) or all contact paths. Possible values are true or 
	 * false. Default: false
	 */

	ContactPaths getContactPath(String otherUserId, String userId, Boolean allPaths);
}
