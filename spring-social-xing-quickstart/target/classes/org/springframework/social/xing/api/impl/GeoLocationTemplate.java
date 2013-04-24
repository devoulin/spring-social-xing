package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.GeoLocationOperations;
import org.springframework.social.xing.api.NearbyItems;
import org.springframework.social.xing.api.NearbyItemsNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class GeoLocationTemplate extends AbstractTemplate implements GeoLocationOperations {

	private RestTemplate restOperations;

	public GeoLocationTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public void updateGeographicalLocation(Double accuracy, Double latitude, Double longitude, String userId, Integer ttl) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		parameters.add("accuracy", accuracy.toString());
		parameters.add("latitude", latitude.toString());
		parameters.add("longitude", longitude.toString());
		if (ttl != null && ttl > 0 && ttl < 864001)
			parameters.add("ttl", ttl.toString());

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/geo_location").queryParams(parameters);
		restOperations.put(uriBuilder.build(), null);

	}

	@Override
	public NearbyItems getNearbyUsers(String userId, String age, String radius) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (radius != null)
			parameters.add("radius", radius.toString());
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/nearby_users.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), NearbyItemsNode.class).getNearbyItems();

	}

}
