package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.RecommendationOperations;
import org.springframework.social.xing.api.Recommendations;
import org.springframework.social.xing.api.RecommendationsNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class RecommendationTemplate extends AbstractTemplate implements RecommendationOperations {

	private RestTemplate restOperations;

	public RecommendationTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public Recommendations getRecommendations(String userId, Integer limit, Integer offset, String similarUserId) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("similar_user_id", similarUserId);
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/network/recommendations.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), RecommendationsNode.class).getRecommendations();
	}

	@Override
	public void blockRecommendation(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/network/recommendations/user/" + id);
		restOperations.delete(uriBuilder.build());
	}
}
