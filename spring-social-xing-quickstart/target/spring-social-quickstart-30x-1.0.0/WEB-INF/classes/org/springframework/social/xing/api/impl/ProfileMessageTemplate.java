package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ProfileMessage;
import org.springframework.social.xing.api.ProfileMessageNode;
import org.springframework.social.xing.api.ProfileMessageOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ProfileMessageTemplate extends AbstractTemplate implements ProfileMessageOperations {

	RestTemplate restOperations;

	public ProfileMessageTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public ProfileMessage getProfileMessage(String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/profile_message.json");
		return restOperations.getForObject(uriBuilder.build(), ProfileMessageNode.class).getProfileMessage();
	}

	@Override
	public void updateProfileMessage(String message, String userId, Boolean isPublic) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("message", message);
		parameters.add("public", isPublic.toString());

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/me/profile_message").queryParams(parameters);
		restOperations.put(uriBuilder.build(), null);
	}

}
