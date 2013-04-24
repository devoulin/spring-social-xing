package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.BookmarkOperations;
import org.springframework.social.xing.api.Bookmarks;
import org.springframework.social.xing.api.BookmarksNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class BookmarkTemplate extends AbstractTemplate implements BookmarkOperations {

	private RestTemplate restOperations;

	public BookmarkTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public Bookmarks getBookmarks(String userId, Integer limit, Integer offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();

		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/bookmarks.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), BookmarksNode.class).getBookmarks();

	}

	@Override
	public void createBookmark(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/bookmarks/" + id + ".json");
		restOperations.put(uriBuilder.build(), null);
	}

	@Override
	public void deleteBookmark(String id, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/bookmarks/" + id + ".json");
		restOperations.delete(uriBuilder.build());
	}
}
