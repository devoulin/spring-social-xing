package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ContactRequestOperations;
import org.springframework.social.xing.api.ContactRequests;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactRequestTemplate extends AbstractTemplate implements ContactRequestOperations {

	private RestTemplate restOperations;

	public ContactRequestTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public ContactRequests getContactRequests(String userId, Integer limit, Integer offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contact_requests.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ContactRequests.class);
	}

	@Override
	public ContactRequests getSentContactRequests(String userId, Integer limit, Integer offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contact_requests/sent.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ContactRequests.class);
	}

	@Override
	public void initiateContactRequest(String userId, String message) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("message", message);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contact_requests").queryParams(parameters);
		restOperations.postForObject(uriBuilder.build(), null, String.class);
	}

	@Override
	public void acceptContactRequest(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contact_requests/" + id + "/accept");
		restOperations.put(uriBuilder.build(), null);
	}

	@Override
	public void revokeOrDenyContactRequest(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contact_requests/" + id);
		restOperations.delete(uriBuilder.build());
	}
}
