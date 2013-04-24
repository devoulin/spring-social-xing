package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.InvitationOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class InvitationTemplate extends AbstractTemplate implements InvitationOperations {

	private RestTemplate restOperations;

	public InvitationTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public void sendInvitations(String toEmails, String message) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		parameters.add("to_emails", toEmails);
		if (message != null)
			parameters.add("message", message);
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/invite").queryParams(parameters);
		restOperations.postForObject(uriBuilder.build(), null, null);

	}
}
