package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface ContactOperations {

	/**
	 * Returns the requested user's contacts. The nested user data this call returns are 
	 * the same as the get user details call. You can't request more than 100 contacts at 
	 * once (see limit parameter), but you can perform several requests in parallel. If 
	 * you execute this call with limit=0, it will tell you how many contacts the user
	 * has without returning any user data.
	 * If the current user doesn't have access to the requested user's contacts, the 
	 * value for the user's key will be null (not an empty list!).
	 * By default this call can only access the contacts of your direct contacts, i.e. 
	 * second-level contacts. If you need further access, please get in touch with us.
	 * @param userId required. ID of the user whose contacts are to be returned
	 * @param limit optional. Limits the number of contacts to be returned. Must be zero 
	 * or a positive number. Default: 10, Maximum: 100
	 * @param offset optional. Offset. Must be zero or a positive number. Default: 0
	 * @param orderBy optional. Field that determines the ascending order of the returned 
	 * list. Currently only supports "last_name". Defaults to "id"
	 */

	Contacts getContacts(String userId, Integer limit, Integer offset);

	/**
	 * Retrieve all tags the user has assigned to a contact.
	 * @param contactId required. ID of the users contact.
	 * @param userId required. ID of the user who assigned the tags.
	 */

	Tags retriveAssignedTags(String contactId, String userId);

	/**
	 * Returns the list of contacts who are direct contacts of both the given and the 
	 * current user. The nested user data this call returns are the same as the get user 
	 * details call. You can't request more than 100 shared contacts at once (see limit 
	 * parameter), but you can perform several requests in parallel. If you execute this 
	 * call with limit=0, it will tell you how many contacts the user has without returning 
	 * any user data.
	 * If the current user doesn't have access to the requested user's contacts, he isn't
	 * allowed to see how many contacts he has in common with the requested user. In 
	 * contrast to the get contacts call, this call will fail and return a 403 message 
	 * instead.
	 * @param userId required. ID of user whose contacts to return
	 * @param limit optional. Limits the number of contacts to be returned. Must be zero 
	 * or a positive number. Default: 10, Maximum: 100
	 * @param offset optional. Offset. Must be zero or a positive number. Default: 0
	 * @param orderBy optional. Field that determines the ascending order of the returned 
	 * list. Currently only supports "last_name". Defaults to "id"
	 */

	Contacts getSharedContacts(String userId, Integer limit, Integer offset, String orderBy);
}
