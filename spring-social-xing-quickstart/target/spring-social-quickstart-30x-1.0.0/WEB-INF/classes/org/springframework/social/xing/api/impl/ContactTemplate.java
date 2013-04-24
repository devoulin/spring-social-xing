package org.springframework.social.xing.api.impl;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;
import static org.springframework.social.xing.api.impl.XingTemplate.USER_FIELDS;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.xing.api.ContactOperations;
import org.springframework.social.xing.api.Contacts;
import org.springframework.social.xing.api.ContactsNode;
import org.springframework.social.xing.api.SharedContactsNode;
import org.springframework.social.xing.api.Tags;
import org.springframework.social.xing.api.TagsNode;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tomasz Wojtowicz - twentyZen
 */

public class ContactTemplate extends AbstractTemplate implements ContactOperations {

	RestTemplate restOperations;

	public ContactTemplate(RestTemplate restTemplate) {
		this.restOperations = restTemplate;
	}

	@Override
	public Contacts getContacts(String userId, Integer limit, Integer offset) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contacts.json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), ContactsNode.class).getContacts();

	}

	@Override
	public Tags retriveAssignedTags(String contactId, String userId) {

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contacts/" + contactId + "/tags.json");
		return restOperations.getForObject(uriBuilder.build(), TagsNode.class).getTags();
	}

	@Override
	public Contacts getSharedContacts(String userId, Integer limit, Integer offset, String orderBy) {

		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		if (limit != null && limit > -1)
			parameters.add("limit", String.valueOf(limit));
		if (offset != null && offset > -1)
			parameters.add("offset", String.valueOf(offset));
		if (orderBy != null && !orderBy.isEmpty())
			parameters.add("order_by", orderBy);
		parameters.add("user_fields", USER_FIELDS);

		URIBuilder uriBuilder = URIBuilder.fromUri(BASE_URL + "/users/" + userId + "/contacts/shared .json").queryParams(parameters);
		return restOperations.getForObject(uriBuilder.build(), SharedContactsNode.class).getContacts();

	}
}
