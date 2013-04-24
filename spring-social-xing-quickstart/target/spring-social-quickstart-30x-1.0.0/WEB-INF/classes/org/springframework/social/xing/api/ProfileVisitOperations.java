package org.springframework.social.xing.api;

import java.util.List;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface ProfileVisitOperations {

	/**
	 * Returns a list of users who recently visited the specified user's profile. Entries 
	 * with a value of null in the user_id attribute indicate anonymous (non-XING) users 
	 * (e.g. resulting from Google searches).
	 * @param userId required. ID of the user whose profile visits are to be returned
	 * @param limit optional. Restricts the number of profile visits to be returned. 
	 * This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 * @param since optional. Only returns visits more recent than the specified time 
	 * stamp (ISO 8601). You can also pass the value of the visited_at_encrypted field 
	 * of a visit to see all visits that were more recent than this one.
	 * @param stripHtml optional. Specifies whether the profile visit reason should be 
	 * stripped of HTML (true) or not (false). The default value is false. Other values 
	 * also default to false.
	 */

	List<Visit> getVisits(String userId, Integer limit, Integer offset, Long since, Boolean stripHtml);

	/**
	 * Creates a profile visit. The visiting user will be derived from the user executing 
	 * the call, and the visit reason derived from the consumer.
	 * @param userId required. ID of the visited user.
	 */

	void createVisit(String userId);
}
