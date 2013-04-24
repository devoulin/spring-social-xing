package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.StatusMessageOperations;
import org.springframework.web.client.RestOperations;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class StatusMessageTemplate extends AbstractTemplate implements StatusMessageOperations {

	private RestOperations restOperations;

	public StatusMessageTemplate(RestOperations restOperations) {

		this.restOperations = restOperations;
	}

	@Override
	public void updateStatus(String id, String message) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + id + "/" + message);
		restOperations.postForObject(uriBuilder.build(), null, String.class);

	}

}
