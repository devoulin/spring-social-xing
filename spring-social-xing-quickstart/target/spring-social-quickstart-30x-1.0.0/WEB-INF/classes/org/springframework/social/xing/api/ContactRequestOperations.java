package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface ContactRequestOperations {

	/**
	 * Lists all pending incoming contact requests the specified user 
	 * has received from other users.
	 * @param userId required. ID of the user whose incoming contact requests are to be returned
	 * @param limit optional. Restricts the number of contact requests to be returned. This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 * @param userFields optional. List of user attributes to return. If this parameter is not used, only the ID will be returned. For a list of available profile fields, please refer to the example response below. All top-level attributes (e.g. id, page_name, photo_urls,...) are valid fields. It is also possible to get an even more detailed response, e.g photo_urls.medium or professional_experience.primary_company.name
	 */

	ContactRequests getContactRequests(String userId, Integer limit, Integer offset);

	/**
	 * Lists all pending contact requests the specified user has sent.
	 * @param userId required. ID of the user whose sent contact requests are to be returned
	 * @param limit optional. Restricts the number of contact requests to be returned. 
	 * This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 */

	ContactRequests getSentContactRequests(String userId, Integer limit, Integer offset);

	/**
	 * Initiates a contact request between the current user (sender) and the specified user (recipient).
	 * @param userId required. ID of the user receiving the contact request
	 * @param message optional. Message attached to the contact request
	 */

	void initiateContactRequest(String userId, String message);

	/**
	 * Accepts an incoming contact request.
	 * @param id required Sender ID
	 * @param userId required. Recipient ID
	 */

	void acceptContactRequest(String id, String userId);

	/**
	 * Denies an incoming contact request or revokes an initiated contact request.
	 * @param id required. Sender ID
	 * @param user_id required. Recipient ID
	 */

	void revokeOrDenyContactRequest(String id, String userId);
}
