package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface RecommendationOperations {

	/**
	 * Returns a list of users the specified user might know.
	 * @param userId required. ID of the user the recommendations are generated for.
	 * @param limit optional. Limit the number of recommendations to be returned. 
	 * This must be a positive number. Default: 10, Maximum: 100
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 * @param similarUserId optional. User ID of other users for whom interesting 
	 * users should be returned. The number of returned recommendations will be 
	 * limited to 4 if no limit is set.
	 */

	Recommendations getRecommendations(String userId, Integer limit, Integer offset, String similarUserId);

	/**
	 * Block recommendation for user with given id.
	 * @param id required. User ID which should not appear in further recommendations
	 * @param userId required. User ID
	 */

	void blockRecommendation(String id, String userId);
}
