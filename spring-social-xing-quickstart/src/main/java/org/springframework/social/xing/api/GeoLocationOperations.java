package org.springframework.social.xing.api;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public interface GeoLocationOperations {

	/**
	 * Update a user's geographical location with a given user_id. This user can then be 
	 * found using the "get nearby users" call.
	 * @param accuracy required. The accuracy of the detected location in meters 
	 * (e.g. 12.5, 50, 50.0). Must be zero or a positive decimal number (max 3000.0 meters).
	 * @param latitude required. User's geographical latitude (e.g. 53.55555). 
	 * Valid values range from -90.0 to 90.0 degrees.
	 * @param longitude required. User's geographical longitude (e.g. 9.98765). 
	 * Valid values range from -180.0 to 180.0 degrees.
	 * @param userId required. ID of user
	 * @param ttl optional. How long the user can be found at this location by other users. 
	 * Valid values range from 1 to 864000 seconds. Default: 420 (7 minutes).
	 */

	void updateGeographicalLocation(Double accuracy, Double latitude, Double longitude, String userId, Integer ttl);

	/**
	 * Get the users that are near your current location.
	 * Note: You need to set your location before this call can be executed.
	 * @param userId required. ID of user whose nearby users are to be returned
	 * @param age optional. The maximum age (expressed in seconds) of nearby check-ins to
	 * look for. The default and maximum is 420 seconds (i.e. 7 minutes).
	 * @param radius optional. The radius (in meters) within which to search. The default
	 * is 50 (meters), max. 3000 (meters). Any higher values are cut off at 3000m.
	 */

	NearbyItems getNearbyUsers(String userId, String age, String radius);
}
