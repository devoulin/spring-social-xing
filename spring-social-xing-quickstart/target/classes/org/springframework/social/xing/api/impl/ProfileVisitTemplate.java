package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;

import java.util.List;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ProfileVisitOperations;
import org.springframework.social.xing.api.Visit;
import org.springframework.social.xing.api.Visits;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ProfileVisitTemplate extends AbstractTemplate implements ProfileVisitOperations {

	private RestTemplate restOperations;

	public ProfileVisitTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public List<Visit> getVisits(String userId, Integer limit, Integer offset, Long since, Boolean stripHtml) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		if (since != null && since > -1)
			parameters.add("since", since.toString());
		if (stripHtml != null)
			parameters.add("strip_html", stripHtml.toString());

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/visits.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), Visits.class).getVisits();

	}

	@Override
	public void createVisit(String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/visits.json");
		restOperations.postForObject(uriBuilder.build(), null, null);
	}

}
