package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.Job;
import org.springframework.social.xing.api.JobNode;
import org.springframework.social.xing.api.JobOperations;
import org.springframework.social.xing.api.JobRecommendationsNode;
import org.springframework.social.xing.api.Jobs;
import org.springframework.social.xing.api.JobsNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class JobTemplate extends AbstractTemplate implements JobOperations {

	private RestOperations restOperations;

	public JobTemplate(RestTemplate restOperations) {
		this.restOperations = restOperations;
	}

	@Override
	public Job getJob(String id) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/jobs/" + id + ".json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), JobNode.class).getJob();

	}

	@Override
	public Jobs findJobs(String query, Integer limit, String location, Integer offset) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("query", query);

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (location != null && !location.isEmpty())
			parameters.add("location", location);
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/jobs/find.json");
		return restOperations.getForObject(uriBuilder.build(), JobsNode.class).getJobs();
	}

	@Override
	public Jobs getRecommendedJobs(String userId, Integer limit, Integer offset) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("user_id", userId);
		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/jobs/find.json");
		return restOperations.getForObject(uriBuilder.build(), JobRecommendationsNode.class).getJobRecommendations();

	}
}
