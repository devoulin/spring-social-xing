package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ContactPathOperations;
import org.springframework.social.xing.api.ContactPaths;
import org.springframework.social.xing.api.ContactPathsNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactPathTemplate extends AbstractTemplate implements ContactPathOperations {

	RestTemplate restOperations;

	public ContactPathTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public ContactPaths getContactPath(String otherUserId, String userId, Boolean allPaths) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (allPaths != null)
			parameters.add("all_paths", allPaths.toString());
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/network/" + otherUserId + "/paths.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ContactPathsNode.class).getContactPaths();

	}
}
