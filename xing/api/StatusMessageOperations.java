package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface StatusMessageOperations {

	/**
	 * Posts a new status update for the specified user in the activity stream.
	 * 
	 * @param id required - ID of the user whose status is to be updated.
	 * @param message required - The new status update. The maximum length is 420 characters.
	 */

	void updateStatus(String id, String message);
}
