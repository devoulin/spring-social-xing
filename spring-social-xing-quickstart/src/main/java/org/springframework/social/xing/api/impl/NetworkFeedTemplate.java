package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS_FEED;

import java.util.List;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ActivitiesNode;
import org.springframework.social.xing.api.Comment;
import org.springframework.social.xing.api.CommentsNode;
import org.springframework.social.xing.api.Like;
import org.springframework.social.xing.api.LikesNode;
import org.springframework.social.xing.api.NetworkActivitiesNode;
import org.springframework.social.xing.api.NetworkFeed;
import org.springframework.social.xing.api.NetworkFeedOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class NetworkFeedTemplate extends AbstractTemplate implements NetworkFeedOperations {

	private RestTemplate restOperations;

	public NetworkFeedTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public List<NetworkFeed> getNetworkFeed(String userId, Boolean aggregate, Long since, Long until) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (aggregate != null)
			parameters.add("aggregate", aggregate.toString());
		if (since != null && since > 0)
			parameters.add("since", since.toString());
		if (until != null && until > 0 && (since == null || since == 0))
			parameters.add("until", until.toString());
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/network_feed.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), NetworkActivitiesNode.class).getNetworkFeed();
	}

	@Override
	public List<NetworkFeed> getUserFeed(String id, Long since, Long until) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (since != null && since > 0)
			parameters.add("since", since.toString());
		if (until != null && until > 0 && (since == null || since == 0))
			parameters.add("until", until.toString());
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + id + "/feed.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), NetworkActivitiesNode.class).getNetworkFeed();
	}

	@Override
	public NetworkFeed getActivity(String id) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + id + ".json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ActivitiesNode.class).getActivities();

	}

	@Override
	public void shareActivity(String id, String text) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (text != null && !text.isEmpty())
			parameters.add("text", text);
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + id + "/share.json").queryParams(parameters);
		restOperations.postForObject(uriBuilder.build(), null, null);

	}

	@Override
	public void deleteActivity(String id) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + id + "json");
		restOperations.delete(uriBuilder.build());

	}

	@Override
	public List<Comment> getComments(String activityId, Long limit, Long offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (offset != null && offset > -1)
			parameters.add("offset", offset.toString());
		if (limit != null && limit > -1)
			parameters.add("limit", limit.toString());
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/comments .json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), CommentsNode.class).getComments();
	}

	@Override
	public void addComment(String activityId, String text) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.add("text", text);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/comments.json").queryParams(parameters);
		restOperations.postForObject(uriBuilder.build(), null, null);

	}

	@Override
	public void deleteComment(String activityId, String id) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/comments/" + id + ".json");
		restOperations.delete(uriBuilder.build());
	}

	@Override
	public List<Like> getLikes(String activityId, Long limit, Long offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (offset != null && offset > -1)
			parameters.add("offset", offset.toString());
		if (limit != null && limit > -1)
			parameters.add("limit", limit.toString());
		parameters.add("user_fields", USER_FIELDS_FEED);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/likes.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), LikesNode.class).getLikes();

	}

	@Override
	public void likeActivity(String activityId) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/like.json").queryParams(parameters);
		restOperations.put(uriBuilder.build(), null);

	}

	@Override
	public void unlikeActivity(String activityId) {
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/activities/" + activityId + "/like.json").queryParams(parameters);
		restOperations.delete(uriBuilder.build());

	}
}
