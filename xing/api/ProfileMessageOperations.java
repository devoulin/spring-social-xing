package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface ProfileMessageOperations {

	/**
	 * Get the recent profile message for the user with the given ID.
	 * @param user_id required User ID
	 * @return {@link ProfileMessage}
	 */

	ProfileMessage getProfileMessage(String userId);

	/**
	 * Update the profile message for the user with the given ID.
	 * @param message required - This is the actual profile message that is being updated. 
	 * The maximum length is 140 characters. Leave empty to delete the current profile message.
	 * @param user_id required - User ID
	 * @param isPublic optional - Specifies whether the profile message should be visible to everyone 
	 * (true) or just a user's direct contacts (false). The default is true. This parameter corresponds
	 * to the "only visible to direct contacts" checkbox on a user's profile page.
	 */

	void updateProfileMessage(String message, String userId, Boolean isPublic);
}
