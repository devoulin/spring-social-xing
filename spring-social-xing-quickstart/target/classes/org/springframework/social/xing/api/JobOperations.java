package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface JobOperations {

	/**
	 * Returns a single job posting. When the contact field is present, it contains
	 * either a company or a user. The company field is not in all cases related to
	 * a company profile on XING (please see the links section).
	 * @param id - required - Job ID
	 * @return {@link Job}
	 */

	Job getJob(String id);

	/**
	 * Returns a list of job postings that match the given criteria.
	 * @param query - required. The search query
	 * @param limit - optional. Restrict the number of job postings to be returned. 
	 * This must be a positive number. Default: 10
	 * @param location - optional. A geo coordinate in the format latitude, longitude, radius. 
	 * Radius is specified in kilometers. Example: "51.1084,13.6737,100"
	 * @param offset - optional. Offset. This must be a positive number. Default: 0
	 * @return {@link Jobs}
	 */

	Jobs findJobs(String query, Integer limit, String location, Integer offset);

	/**
	 * Returns a list of job recommendations for the user.
	 * @param userId - required. ID of the user starting the conversation
	 * @param limit - optional. Restrict the number of job postings to be returned. 
	 * This must be a positive number. Default: 10
	 * @param offset - optional. Offset. This must be a positive number. Default: 0
	 * @return {@link Jobs}
	 */

	Jobs getRecommendedJobs(String userId, Integer limit, Integer offset);
}
